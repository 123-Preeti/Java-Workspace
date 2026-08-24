package com.cl.contacthub.services;

import com.cl.contacthub.daos.AdminDao;
import com.cl.contacthub.entites.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    AdminDao adminDao;

    public Admin saveAdmin(Admin admin) {
        return adminDao.save(admin);
    }
    public String deleteAdmin(Long adminId) {

        if (adminDao.existsById(adminId)) {

            adminDao.deleteById(adminId);

            return adminId + " deleted successfully";

        } else {

            return adminId + " already deleted / not found";
        }
    }

    public Admin findAdminById(Long id) {
        return adminDao.findById(id).orElse(null);
    }
        public Admin updateAdmin(Admin admin) {
       return adminDao.save(admin);
    }

}
