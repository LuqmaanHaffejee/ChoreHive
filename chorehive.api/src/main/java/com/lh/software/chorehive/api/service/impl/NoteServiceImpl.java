package com.lh.software.chorehive.api.service.impl;

import com.lh.software.chorehive.api.domain.Note;
import com.lh.software.chorehive.api.repository.NoteRepository;
import com.lh.software.chorehive.api.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NoteServiceImpl implements NoteService {
  
  private final NoteRepository noteRepository;
  
  @Override
  public Note saveNote(Note note) {
    return noteRepository.save(note);
  }
  
}
