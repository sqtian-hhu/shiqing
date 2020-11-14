package com.admin.mapper;

import com.admin.pojo.Admin;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface adminMapper {

//    @Select("select * from admin_users")
    List<Admin> findAll();

    void saveAdmin(Admin admin);
}
