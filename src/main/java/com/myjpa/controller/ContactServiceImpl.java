package com.myjpa.controller;

import com.myjpa.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
//import java.util.Lists;

/**
 * Created by book on 11.12.2017.
 */
@Service("springJpaContactService")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Transactional(readOnly = true)
    public List<Contact> findAll() {

        return contactRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Contact> findByFirstName(String firstName) {

        return contactRepository.findByFirstName(firstName);
    }

    @Transactional(readOnly = true)
    public List<Contact> findByFirstNameAndLastName(
            String firstName, String lastName) {

        return contactRepository.findByFirstNameAndLastName(
                                firstName, lastName);
    }


}
