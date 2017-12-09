package com.myjpa.controller;

import com.myjpa.model.Contact;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by book on 09.12.2017.
 */
@Service("jpaContactService")
@Repository
@Transactional
public class ContactServiceImpl implements ContactService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Contact> findAll() {
        return entityManager.createNamedQuery("Contact.findAll", Contact.class).getResultList();
    }

    @Override
    public List<Contact> findAllWithDetail() {
        return null;
    }

    @Override
    public Contact findById(Long id) {
        return null;
    }

    @Override
    public Contact save(Contact contact) {
        return null;
    }

    @Override
    public void delete(Contact contact) {

    }
}
