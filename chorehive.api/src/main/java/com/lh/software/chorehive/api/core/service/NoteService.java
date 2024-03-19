package com.lh.software.chorehive.api.core.service;

import com.lh.software.chorehive.api.core.domain.Note;

import java.util.List;

public interface NoteService {
  
  Note saveNote(Note note);
  
  List<Note> findAll();
  
  Note findById(Long id);
  
}
