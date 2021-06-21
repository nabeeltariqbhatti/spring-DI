package com.contcatservice.service;

import java.util.List;

import com.contcatservice.entity.Contact;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);
}
