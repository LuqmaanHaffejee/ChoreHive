package com.lh.software.chorehive.api.core.service.impl;

import com.lh.software.chorehive.api.core.service.TaskService;
import com.lh.software.chorehive.api.core.domain.Task;
import com.lh.software.chorehive.api.core.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TaskServiceImpl implements TaskService {
  
  private final TaskRepository taskRepository;
  
  @Override
  public Task saveTask(Task task) {
    task.setDateCreated(LocalDate.now());
    return taskRepository.save(task);
  }
  
  @Override
  public List<Task> findAll() {
    return taskRepository.findAll();
  }
  
  @Override
  public Task findById(Long id) {
    return taskRepository.findById(id).orElseThrow();
  }
  
}
