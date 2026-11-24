package com.example.user.entity;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "users")
public class UserEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String username;
	    private String password;

	    // Just a plain list, no JPA mapping
	    @Transient
	    private List<JournalEntity> journalEntries = new ArrayList<>();

		public UserEntity() {
			super();
			// TODO Auto-generated constructor stub
		}

		public UserEntity(Long id, String username, String password, List<JournalEntity> journalEntries) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.journalEntries = journalEntries;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public List<JournalEntity> getJournalEntries() {
			return journalEntries;
		}

		public void setJournalEntries(List<JournalEntity> journalEntries) {
			this.journalEntries = journalEntries;
		}
	    
	    
}
