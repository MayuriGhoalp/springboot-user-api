package com.example.user.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.entity.JournalEntity;
import com.example.user.entity.UserEntity;
import com.example.user.repository.JournalRepository;
import com.example.user.repository.UserRepository;

import jakarta.transaction.Transactional;


@Service
public class Userservice {
	
	@Autowired
    private UserRepository userRepository;

    @Autowired
    private JournalRepository journalRepository;

    @Transactional
    public List<UserEntity> getAllUsersWithJournals() {
        List<UserEntity> users = userRepository.findAll();

        for (UserEntity user : users) {
            List<JournalEntity> journals = journalRepository.findByUserId(user.getId());
            user.setJournalEntries(journals);  // manually attach journals
        }

        return users;
    }
    
    public UserEntity saveUser(UserEntity user) {
        return userRepository.save(user);
    }

}
