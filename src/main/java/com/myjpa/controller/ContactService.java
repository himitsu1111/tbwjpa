package com.myjpa.controller;

import com.myjpa.model.Contact;

import java.util.List;

/**
 * Created by book on 09.12.2017.
 */

public interface ContactService {
    List<Contact> findAll();

    List<Contact> findAllWithDetail();

    Contact findById(Long id);

    Contact save(Contact contact);

    void delete(Contact contact);
}
