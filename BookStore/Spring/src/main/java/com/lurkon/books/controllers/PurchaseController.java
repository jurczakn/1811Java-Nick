package com.lurkon.books.controllers;

import java.util.Collections;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lurkon.books.beans.Book;
import com.lurkon.books.beans.LoginInfo;
import com.lurkon.books.beans.Purchase;
import com.lurkon.books.services.BookService;
import com.lurkon.books.services.PurchaseService;

@RestController
@RequestMapping(value="/purchases")
@CrossOrigin(origins = "http://localhost:4200")
public class PurchaseController {
	@Autowired
	private PurchaseService ps;
	@Autowired
	private BookService bs;
	private static final String USER = "loggedUser";

	@RequestMapping(method=RequestMethod.GET)
	public Set<Purchase> getPurchases(HttpSession session) {
		LoginInfo loggedUser = (LoginInfo) session.getAttribute(USER);
		if(loggedUser.getEmployee()==null) {
			if(loggedUser.getCustomer()==null) {
				return Collections.emptySet();
			} else {
				return ps.getPurchasesByCustomer(loggedUser.getCustomer());
			}
		}
		return ps.getPurchases();
	}
	@RequestMapping(method=RequestMethod.POST)
	public Purchase createPurchase(@RequestBody Purchase p, HttpSession session) {
		LoginInfo loggedUser = (LoginInfo) session.getAttribute(USER);
		Purchase openPurchase = ps.getOpenPurchase(loggedUser.getCustomer());
		if(openPurchase==null) {
			openPurchase = new Purchase(0,loggedUser.getCustomer(),0.0,"OPEN",null);
			ps.createPurchase(openPurchase);
		}
		return openPurchase;
	}
	@RequestMapping(value="{purchId}", method=RequestMethod.GET)
	public Purchase getPurchase(@PathVariable("purchId") int id, HttpSession session) {
		LoginInfo loggedUser = (LoginInfo) session.getAttribute(USER);
		Purchase p = ps.getPurchase(id);
		if(loggedUser.getEmployee()!=null || loggedUser.getCustomer().getId()==p.getCust().getId())
			return p;
		else
			return null;
	}
	@RequestMapping(value="{purchId}", method=RequestMethod.PUT)
	public Purchase updatePurchase(@PathVariable("purchId") int id, @RequestBody Purchase p, HttpSession session) {
		LoginInfo loggedUser = (LoginInfo) session.getAttribute(USER);
		if(loggedUser.getEmployee()!=null || loggedUser.getCustomer()==p.getCust()) {
			return ps.updatePurchase(p);
		} else {
			return null;
		}
	}
	@RequestMapping(value="{purchId}", method=RequestMethod.DELETE)
	public void emptyCart(@PathVariable("purchId") int id, HttpSession session) {
		Purchase p = ps.getPurchase(id);
		ps.emptyCart(p);
	}
	@RequestMapping(value="{purchId}/book/{bookId}", method=RequestMethod.PUT)
	public Purchase addToCart(@PathVariable("purchId") int purchId, @PathVariable("bookId") int bookId, HttpSession session) {
		Purchase p = ps.getPurchase(purchId);
		LoginInfo loggedUser = (LoginInfo) session.getAttribute(USER);
		if(p==null)
			p = ps.createPurchase(new Purchase(0, loggedUser.getCustomer(),0, "OPEN", null ));
		Book b = bs.getBookById(bookId);
		return ps.addBookToCart(p, b);
	}
	@RequestMapping(value="{purchId}/book/{bookId}", method=RequestMethod.DELETE)
	public Purchase removeFromCart(@PathVariable("purchId") int purchId, @PathVariable("bookId") int bookId, HttpSession session) {
		Purchase p = ps.getPurchase(purchId);
		Book b = bs.getBookById(bookId);
		return ps.removeBookFromCart(p, b);
	}
	
	
	public PurchaseService getPs() {
		return ps;
	}
	public void setPs(PurchaseService ps) {
		this.ps = ps;
	}
	public BookService getBs() {
		return bs;
	}
	public void setBs(BookService bs) {
		this.bs = bs;
	}
	
}
