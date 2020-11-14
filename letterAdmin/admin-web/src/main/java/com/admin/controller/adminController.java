package com.admin.controller;

import com.admin.pojo.Admin;
import com.admin.service.adminService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class adminController {

    @Autowired
    private adminService adminService;

    @RequestMapping("/findAll")
    public String findAll(Model model){

        List<Admin> adminList = adminService.findAll();
        //存入model
        model.addAttribute("list",adminList);

        return adminList.toString();
    }

    @RequestMapping("/register")
    public void register(Admin admin, HttpServletRequest request, HttpServletResponse response) throws IOException {
        adminService.saveAdmin(admin);
        response.sendRedirect(request.getContextPath() +"/admin/findAll");
        return;
    }



}
