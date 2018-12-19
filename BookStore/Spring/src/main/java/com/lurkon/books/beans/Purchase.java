package com.lurkon.books.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.ParameterMode;
import javax.persistence.SequenceGenerator;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "addBook", procedureName = "add_book_to_cart", parameters = {
				@StoredProcedureParameter(type = Integer.class, mode = ParameterMode.IN),
				@StoredProcedureParameter(type = Integer.class, mode = ParameterMode.IN),
				@StoredProcedureParameter(type = Double.class, mode = ParameterMode.OUT),
				@StoredProcedureParameter(type = void.class, mode = ParameterMode.REF_CURSOR) }),
		@NamedStoredProcedureQuery(name = "removeBook", procedureName = "remove_book_from_cart", parameters = {
				@StoredProcedureParameter(type = Integer.class, mode = ParameterMode.IN),
				@StoredProcedureParameter(type = Integer.class, mode = ParameterMode.IN),
				@StoredProcedureParameter(type = Double.class, mode = ParameterMode.OUT),
				@StoredProcedureParameter(type = void.class, mode = ParameterMode.REF_CURSOR) }),
		@NamedStoredProcedureQuery(name = "emptyCart", procedureName = "empty_cart", parameters = {
				@StoredProcedureParameter(type = Integer.class, mode = ParameterMode.IN) }) })
@Table(name = "purchase")
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "purchase")
	@SequenceGenerator(name = "purchase", sequenceName = "purchase_seq", allocationSize=1)
	private int id;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id")
	private Customer cust;
	private double total;
	private String status;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "purchase")
	private Set<InvoiceLine> invoiceLines;

	public Purchase() {
		super();
	}

	public Purchase(int id, Customer cust, double total, String status, Set<InvoiceLine> invoiceLines) {
		super();
		this.id = id;
		this.cust = cust;
		this.total = total;
		this.status = status;
		this.invoiceLines = invoiceLines;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<InvoiceLine> getInvoiceLines() {
		return invoiceLines;
	}

	public void setInvoiceLines(Set<InvoiceLine> invoiceLines) {
		this.invoiceLines = invoiceLines;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cust == null) ? 0 : cust.hashCode());
		result = prime * result + id;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		long temp;
		temp = Double.doubleToLongBits(total);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Purchase other = (Purchase) obj;
		if (cust == null) {
			if (other.cust != null)
				return false;
		} else if (!cust.equals(other.cust))
			return false;
		if (id != other.id)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return (Double.doubleToLongBits(total) == Double.doubleToLongBits(other.total));
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Purchase [id=");
		builder.append(id);
		builder.append(", cust=");
		builder.append(cust);
		builder.append(", total=");
		builder.append(total);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
}
