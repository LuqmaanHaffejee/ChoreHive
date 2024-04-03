package com.lh.software.chorehive.api.web.config;

import com.lh.software.chorehive.api.core.domain.Task;
import com.lh.software.chorehive.api.core.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class DummyDataPopulator {
  
  private final TaskService taskService;
  
  @Transactional
  public void populateData() {
    Task task = new Task();
    task.setSummary("Respond to email");
    task.setDescription("Respond to Jack about using UIPath to develop angular webapps");
    this.taskService.addNewTask(task);
    
    task = new Task();
    task.setSummary("Setup client meeting");
    task.setDescription("Setup meeting with ABC client to discuss plans for the demo");
    this.taskService.addNewTask(task);
  }
  
}
