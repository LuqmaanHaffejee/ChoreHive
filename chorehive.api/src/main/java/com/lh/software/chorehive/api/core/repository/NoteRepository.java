package com.lh.software.chorehive.api.core.repository;

import com.lh.software.chorehive.api.core.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
