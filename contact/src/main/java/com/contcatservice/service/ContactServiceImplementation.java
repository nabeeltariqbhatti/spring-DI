package com.contcatservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contcatservice.entity.Contact;

@Service
public class ContactServiceImplementation implements ContactService {

    List<Contact> contacts = List.of(new Contact(1L, "email@okay.com", "Unknown 1", 13L),
            new Contact(1L, "email@okay.com", "Unknown 1", 13L), new Contact(1L, "email@okay.com", "Unknown 1", 13L),
            new Contact(1L, "email@okay.com", "Unknown 1", 12L), new Contact(1L, "email@okay.com", "Unknown 1", 12L),
            new Contact(1L, "email@okay.com", "Unknown 1", 12L), new Contact(1L, "email@okay.com", "Unknown 1", 11L),
            new Contact(1L, "email@okay.com", "Unknown 1", 11L), new Contact(1L, "email@okay.com", "Unknown 1", 11L));

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return contacts.stream().filter(contact -> contact.getUserId() == userId).collect(Collectors.toList());
    }

}
