package com.lurkon.books.repos;

import org.springframework.data.repository.CrudRepository;

import com.lurkon.books.beans.Address;

public interface AddressDao extends CrudRepository<Address,Integer> {

}
