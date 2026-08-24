package com.cl.contacthub.daos;

import com.cl.contacthub.entites.ContactHub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactHubDao extends JpaRepository<ContactHub,Long> {
}
