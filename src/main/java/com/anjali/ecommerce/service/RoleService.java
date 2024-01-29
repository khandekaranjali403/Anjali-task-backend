package com.anjali.ecommerce.service;

import com.anjali.ecommerce.dao.RoleDao;
import com.anjali.ecommerce.entity.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
