package com.lurkon.books.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/*
 * Here is our embeddable. I am completely breaking OOP concepts and reading
 * my values in as longs, for space concerns and also because I will not be
 * using this thing.
 */
@Embeddable
public class InvoiceLineId implements Serializable{
	private static final long serialVersionUID = 4353250803775231855L;
	@Column(name="purchase_id")
	private Long purchaseId;
	@Column(name="book_id")
	private Long bookId;
	
	public InvoiceLineId() {
		super();
	}

	public InvoiceLineId(Long purchaseId, Long bookId) {
		super();
		this.purchaseId = purchaseId;
		this.bookId = bookId;
	}

	public Long getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		result = prime * result + ((purchaseId == null) ? 0 : purchaseId.hashCode());
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
		InvoiceLineId other = (InvoiceLineId) obj;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		if (purchaseId == null) {
			if (other.purchaseId != null)
				return false;
		} else if (!purchaseId.equals(other.purchaseId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InvoiceLineId [purchaseId=");
		builder.append(purchaseId);
		builder.append(", bookId=");
		builder.append(bookId);
		builder.append("]");
		return builder.toString();
	}		
}
