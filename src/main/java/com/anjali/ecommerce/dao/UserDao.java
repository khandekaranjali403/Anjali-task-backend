package com.anjali.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anjali.ecommerce.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
