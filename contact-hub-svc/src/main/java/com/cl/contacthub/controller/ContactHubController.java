package com.cl.contacthub.controller;

import com.cl.contacthub.entites.Admin;
import com.cl.contacthub.entites.ContactHub;
import com.cl.contacthub.services.ContactHubService;
import com.cl.contacthub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/contact")
@RestController
public class ContactHubController {

    @Autowired
    private ContactHubService contactHubService;


    @PostMapping("/save")
    public ContactHub saveContact(@RequestBody ContactHub contactHub) {
        return contactHubService.saveContact(contactHub);
    }

    @PutMapping("/update")
    public ContactHub updateContact(@RequestBody ContactHub contactHub) {
        return contactHubService.updateContact(contactHub);
    }

    @DeleteMapping("/delete")
    public ContactHub deleteContact(@RequestBody ContactHub contactHub) {
        return contactHubService.deleteContact(contactHub);
    }

    @GetMapping("/{contactId}")
    public ContactHub findContactById(@PathVariable Long contactId) {
        return contactHubService.findContactById(contactId);
    }
}
