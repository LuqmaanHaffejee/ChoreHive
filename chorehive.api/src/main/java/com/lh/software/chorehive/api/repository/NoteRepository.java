package com.lh.software.chorehive.api.repository;

import com.lh.software.chorehive.api.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
