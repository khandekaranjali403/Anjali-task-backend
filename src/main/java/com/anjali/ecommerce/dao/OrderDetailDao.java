package com.anjali.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import com.anjali.ecommerce.entity.OrderDetail;
import com.anjali.ecommerce.entity.User;

import java.util.List;

public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {
    public List<OrderDetail> findByUser(User user);

    public List<OrderDetail> findByOrderStatus(String status);
}
