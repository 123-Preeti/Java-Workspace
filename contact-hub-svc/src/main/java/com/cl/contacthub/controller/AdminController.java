package com.cl.contacthub.controller;

import com.cl.contacthub.entites.Admin;
import com.cl.contacthub.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/admin")
public class AdminController {



    @Autowired
    AdminService adminService;

    @PostMapping("/save")
    public Admin saveAdmin(@RequestBody Admin admin) {
        return adminService.saveAdmin(admin);
    }

    @PutMapping("/update")
    public Admin updateAdmin(@RequestBody Admin admin) {
        return adminService.updateAdmin(admin);
    }

    @DeleteMapping("delete/{adminId}")
    public String deleteAdmin(@PathVariable Long adminId) {

        return adminService.deleteAdmin(adminId);
    }

    @GetMapping("/{adminId}")
    public Admin findAdminById(@PathVariable Long adminId) {
        return adminService.findAdminById(adminId);
    }
}
