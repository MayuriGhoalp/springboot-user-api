package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.entity.JournalEntity;
import com.example.user.repository.JournalRepository;

@Service
public class JournalService {
	
	@Autowired
	public JournalRepository journalRepository;
	
	public JournalEntity saveJournal(JournalEntity journal)
	{
		return journalRepository.save(journal);
	}

}
