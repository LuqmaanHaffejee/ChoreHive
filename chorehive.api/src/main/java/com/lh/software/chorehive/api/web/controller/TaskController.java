package com.lh.software.chorehive.api.web.controller;

import com.lh.software.chorehive.api.core.domain.Task;
import com.lh.software.chorehive.api.core.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("${apiPrefix}/tasks")
public class TaskController {
  
  private final TaskService taskService;
  
  @GetMapping
  public List<Task> getAllTasks() {
    return taskService.findAll();
  }
  
  @PostMapping
  public void addNewTask(@RequestBody Task task) {
    this.taskService.saveTask(task);
  }
  
  @GetMapping("/{id}")
  public Task getTaskById(@PathVariable Long id) {
    return taskService.findById(id);
  }
  
}
