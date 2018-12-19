package com.lurkon.books.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="purchase_book")
@JsonIgnoreProperties(value= {"id", "purchase"})
public class InvoiceLine {
	/* If you needed any more reasons not to use Composite keys, here is one.
	 * Guess what? To create composite keys in a object oriented context, you
	 * need to create a object for your composite key. This is called an
	 * Embeddable in Hibernate. So we tell Hibernate that we have an EmbeddedID
	 * and then give it a class that will hold our key values.
	 */	
	@EmbeddedId
	private InvoiceLineId id;
	@ManyToOne(fetch=FetchType.LAZY)
	/* Because we are currently REPEATING columns because I needed to NOT
	 * COMPLETELY BREAK my Angular front-end, we have to specify our repeated
	 * columns are not intended to be inserted or updated in the database.
	 */
	@JoinColumn(name="purchase_id", insertable=false, updatable=false)
	private Purchase purchase;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="book_id", insertable=false, updatable=false)
	private Book book;
	private int quantity;
	public InvoiceLine() {
		super();
	}
	public InvoiceLine(Purchase purchase, Book book, int quantity) {
		super();
		this.purchase=purchase;
		this.book = book;
		this.quantity = quantity;
	}
	public Purchase getPurchase() {
		return purchase;
	}
	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		result = prime * result + ((purchase == null) ? 0 : purchase.hashCode());
		result = prime * result + quantity;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceLine other = (InvoiceLine) obj;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		if (purchase == null) {
			if (other.purchase != null)
				return false;
		} else if (!purchase.equals(other.purchase))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InvoiceLine [purchase=");
		builder.append(purchase);
		builder.append(", book=");
		builder.append(book);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append("]");
		return builder.toString();
	}
}
