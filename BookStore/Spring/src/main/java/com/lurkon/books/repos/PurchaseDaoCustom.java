package com.lurkon.books.repos;

import com.lurkon.books.beans.Book;
import com.lurkon.books.beans.Purchase;

public interface PurchaseDaoCustom {
	void addBookToCart(Purchase p, Book b);

	void removeBookFromCart(Purchase p, Book b);

	void emptyCart(Purchase p);
}
