package com.lurkon.books.repos;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lurkon.books.beans.Customer;
import com.lurkon.books.beans.Purchase;

@Repository
public interface PurchaseDao extends CrudRepository<Purchase, Integer>, PurchaseDaoCustom {
	Set<Purchase> findPurchasesByCustAndStatus(Customer cust, String status);
	Set<Purchase> findPurchasesByCust(Customer cust);
}
