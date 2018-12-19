package com.lurkon.books.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.lurkon.books.beans.User;
@NoRepositoryBean
public interface UserDao <T extends User> extends CrudRepository<T, Integer>{
	T getByUsernameAndPassword(String username, String password);
}
