package com.lurkon.books.services;

import java.util.Set;

import com.lurkon.books.beans.Book;
import com.lurkon.books.beans.Customer;
import com.lurkon.books.beans.Purchase;

public interface PurchaseService {
	public Purchase addBookToCart(Purchase p, Book b);
	public Purchase removeBookFromCart(Purchase p, Book b);
	public void emptyCart(Purchase p);
	public Purchase getPurchase(int i);
	public Purchase getOpenPurchase(Customer c);
	public Set<Purchase> getPurchasesByCustomer(Customer cust);
	public Set<Purchase> getPurchases();
	public Purchase createPurchase(Purchase p);
	public void deletePurchase(Purchase p);
	public Purchase updatePurchase(Purchase p);
}
