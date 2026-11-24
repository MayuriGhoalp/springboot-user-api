package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.JournalEntity;
import com.example.user.service.JournalService;

@RestController
@RequestMapping("/journal")
public class JournalController {
	
	@Autowired
	public JournalService journalService;
	
	@PostMapping("/save")
	public JournalEntity saveJournal(@RequestBody JournalEntity journal)
	{
		return journalService.saveJournal(journal);
	}

}
