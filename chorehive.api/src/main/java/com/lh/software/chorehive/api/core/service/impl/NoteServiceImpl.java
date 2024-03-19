package com.lh.software.chorehive.api.core.service.impl;

import com.lh.software.chorehive.api.core.service.NoteService;
import com.lh.software.chorehive.api.core.domain.Note;
import com.lh.software.chorehive.api.core.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NoteServiceImpl implements NoteService {
  
  private final NoteRepository noteRepository;
  
  @Override
  public Note saveNote(Note note) {
    return noteRepository.save(note);
  }
  
  @Override
  public List<Note> findAll() {
    return noteRepository.findAll();
  }
  
  @Override
  public Note findById(Long id) {
    return noteRepository.findById(id).orElseThrow();
  }
  
}
