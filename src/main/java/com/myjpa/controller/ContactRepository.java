package com.myjpa.controller;

import com.myjpa.model.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by book on 11.12.2017.
 */
public interface ContactRepository extends CrudRepository<Contact, Long> {

    List<Contact> findAll();
    List<Contact> findByFirstName(String firstName);
    List<Contact> findByFirstNameAndLastName(String firstName, String lastName);
}
