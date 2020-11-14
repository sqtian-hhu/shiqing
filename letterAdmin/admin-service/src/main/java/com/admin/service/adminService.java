package com.admin.service;

import com.admin.pojo.Admin;

import java.util.List;

public interface adminService {

    /**
     * 查找所有用户
     * @return
     */
    List<Admin> findAll();

    /**
     * 保存新用户信息
     * @param admin
     */
    void saveAdmin(Admin admin);
}
