package com.contcatservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contcatservice.entity.Contact;
import com.contcatservice.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactServiceController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId) {

        return contactService.getContactsOfUser(userId);
    }

}
