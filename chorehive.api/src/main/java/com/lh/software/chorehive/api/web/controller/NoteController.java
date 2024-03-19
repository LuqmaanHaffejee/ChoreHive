package com.lh.software.chorehive.api.web.controller;

import com.lh.software.chorehive.api.core.domain.Note;
import com.lh.software.chorehive.api.core.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("${apiPrefix}/notes")
public class NoteController {
  
  private final NoteService noteService;
  
  @GetMapping
  public List<Note> getAllNotes() {
    return noteService.findAll();
  }
  
  @GetMapping("/{id}")
  public Note getNode(@PathVariable Long id) {
    return noteService.findById(id);
  }
  
}
