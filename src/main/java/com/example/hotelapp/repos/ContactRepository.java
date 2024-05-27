package com.example.hotelapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.hotelapp.entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    // Additional query methods, if needed
}
