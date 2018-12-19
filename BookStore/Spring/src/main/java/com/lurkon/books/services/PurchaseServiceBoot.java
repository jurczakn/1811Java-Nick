package com.lurkon.books.services;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lurkon.books.beans.Book;
import com.lurkon.books.beans.Customer;
import com.lurkon.books.beans.Purchase;
import com.lurkon.books.repos.PurchaseDao;

@Component
@Transactional
public class PurchaseServiceBoot implements PurchaseService{
	@Autowired
	private PurchaseDao pd;
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Purchase addBookToCart(Purchase p, Book b) {
		pd.addBookToCart(p, b);
		return pd.findOne(p.getId());
	}

	@Override
	public Purchase removeBookFromCart(Purchase p, Book b) {
		pd.removeBookFromCart(p, b);
		return pd.findOne(p.getId());
	}

	@Override
	public void emptyCart(Purchase p) {
		pd.emptyCart(p);
	}

	@Override
	public Purchase getPurchase(int i) {
		return pd.findOne(i);
	}

	@Override
	public Purchase getOpenPurchase(Customer c) {
		Set<Purchase> purchases = pd.findPurchasesByCustAndStatus(c, "OPEN");
		if(purchases.size() != 1)
			return null;
		return purchases.iterator().next();
	}

	@Override
	public Set<Purchase> getPurchasesByCustomer(Customer cust) {
		return pd.findPurchasesByCust(cust);
	}

	@Override
	public Set<Purchase> getPurchases() {
		Set<Purchase> purch = new HashSet<>();
		Iterable<Purchase> iterable = pd.findAll();
		iterable.forEach(purch::add);
		return purch;
	}

	@Override
	public Purchase createPurchase(Purchase p) {
		return pd.save(p);
	}

	@Override
	public void deletePurchase(Purchase p) {
		pd.delete(p);
	}

	@Override
	public Purchase updatePurchase(Purchase p) {
		return pd.save(p);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
