package com.myjpa;

import com.myjpa.controller.ContactService;
import com.myjpa.model.Contact;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by book on 09.12.2017.
 */
public class SpringApplication {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/app-context-annotation.xml");
        ctx.refresh();

        ContactService contactService = ctx.getBean("jpaContactService", ContactService.class);
        List<Contact> lc = contactService.findAll();
        for (Contact con : lc) {
            System.out.println(con.toString());
            System.out.println();
        }
    }
}
