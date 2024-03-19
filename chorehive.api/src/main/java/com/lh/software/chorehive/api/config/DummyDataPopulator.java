package com.lh.software.chorehive.api.config;

import com.lh.software.chorehive.api.domain.Note;
import com.lh.software.chorehive.api.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class DummyDataPopulator {
  
  private final NoteService noteService;
  
  @Transactional
  public void populateData() {
    Note note = new Note();
    note.setSummary("Respond to email");
    note.setDescription("Respond to Jack about using UIPath to develop angular webapps");
    note.setComplete(false);
    note.setDateCreated(LocalDate.now());
    this.noteService.saveNote(note);
  }
  
}
