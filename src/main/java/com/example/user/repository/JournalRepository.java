package com.example.user.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user.entity.JournalEntity;

public interface JournalRepository extends JpaRepository<JournalEntity, Long> {
    List<JournalEntity> findByUserId(Long userId);
}
