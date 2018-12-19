package com.lurkon.books.repos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.lurkon.books.beans.Book;
import com.lurkon.books.beans.InvoiceLine;
import com.lurkon.books.beans.Purchase;

@Repository
public class PurchaseDaoImpl implements PurchaseDaoCustom {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addBookToCart(Purchase p, Book b) {
		StoredProcedureQuery q = em.createNamedStoredProcedureQuery("addBook");
		q.setParameter(1, p.getId());
		q.setParameter(2, b.getId());
		q.execute();
		for(InvoiceLine i : p.getInvoiceLines())
		{
			em.detach(i);
		}
		em.detach(p);
	}
	@Override
	public void removeBookFromCart(Purchase p, Book b) {
		StoredProcedureQuery q = em.createNamedStoredProcedureQuery("removeBook");
		q.setParameter(1, p.getId());
		q.setParameter(2, b.getId());
		q.execute();
		for(InvoiceLine i : p.getInvoiceLines())
		{
			em.detach(i);
		}
		em.detach(p);
	}
	
	@Override
	public void emptyCart(Purchase p) {
		StoredProcedureQuery q = em.createNamedStoredProcedureQuery("emptyCart");
		q.setParameter(1, p.getId());
		q.execute();
		for(InvoiceLine i : p.getInvoiceLines())
		{
			em.detach(i);
		}
		em.detach(p);
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
