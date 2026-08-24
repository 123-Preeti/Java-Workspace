package com.cl.contacthub.services;

import com.cl.contacthub.daos.ContactHubDao;
import com.cl.contacthub.entites.ContactHub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactHubService {

    @Autowired
    private ContactHubDao contactHubDao;

    public ContactHub saveContact(ContactHub contactHub) {
        return contactHubDao.save(contactHub);
    }

    public ContactHub updateContact(ContactHub contactHub) {
        return contactHubDao.save(contactHub);
    }

    public ContactHub deleteContact(ContactHub contactHub) {
        contactHubDao.delete(contactHub);
        return contactHub;
    }

    public ContactHub findContactById(Long contactId) {
        return contactHubDao.findById(contactId).orElse(null);
    }
}