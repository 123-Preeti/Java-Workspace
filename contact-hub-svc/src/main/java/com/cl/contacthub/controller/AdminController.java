package com.cl.contacthub.controller;

import com.cl.contacthub.entites.Admin;
import com.cl.contacthub.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;



import java.io.IOException;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    // SAVE ADMIN + PROFILE PHOTO
    @PostMapping("/save")
    public Admin saveAdmin(
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam MultipartFile profilePhoto
    ) throws IOException {

        Admin admin = new Admin();

        admin.setFirstName(firstName);
        admin.setLastName(lastName);
        admin.setProfilePhoto(profilePhoto.getBytes());

        return adminService.saveAdmin(admin);
    }

    // UPDATE ADMIN
    @PutMapping("/update")
    public Admin updateAdmin(@RequestBody Admin admin) {
        return adminService.updateAdmin(admin);
    }

    // DELETE ADMIN
    @DeleteMapping("/delete/{adminId}")
    public String deleteAdmin(@PathVariable Long adminId) {
        return adminService.deleteAdmin(adminId);
    }

    // FIND ADMIN
    @GetMapping("/{adminId}")
    public Admin findAdminById(@PathVariable Long adminId) {
        return adminService.findAdminById(adminId);
    }

    // VIEW PROFILE PHOTO
    @GetMapping("/{adminId}/profile-photo")
    public ResponseEntity<byte[]> getProfilePhoto(@PathVariable Long adminId) {

        Admin admin = adminService.findAdminById(adminId);

        if (admin == null) {
            return ResponseEntity.notFound().build();
        }

        if (admin.getProfilePhoto() == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(admin.getProfilePhoto());
    }
}