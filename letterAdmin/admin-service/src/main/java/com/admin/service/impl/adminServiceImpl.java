package com.admin.service.impl;

import com.admin.mapper.adminMapper;
import com.admin.pojo.Admin;
import com.admin.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class adminServiceImpl implements adminService {

    @Autowired
    private adminMapper adminMapper;

    @Override
    public List<Admin> findAll() {
        return adminMapper.findAll();
    }

    @Override
    public void saveAdmin(Admin admin) {
        adminMapper.saveAdmin(admin);
    }
}
