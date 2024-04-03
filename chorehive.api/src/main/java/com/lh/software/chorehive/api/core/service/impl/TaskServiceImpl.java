package com.lh.software.chorehive.api.core.service.impl;

import com.lh.software.chorehive.api.core.service.TaskService;
import com.lh.software.chorehive.api.core.domain.Task;
import com.lh.software.chorehive.api.core.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TaskServiceImpl implements TaskService {
  
  private final TaskRepository taskRepository;
  
  @Override
  @Transactional
  public Task saveTask(Task task) {
    return taskRepository.save(task);
  }
  
  @Override
  @Transactional
  public Task addNewTask(Task task) {
    task.setDateCreated(LocalDate.now());
    task.setComplete(false);
    return this.saveTask(task);
  }
  
  @Override
  @Transactional
  public void toggleCompletion(Long taskId) {
    Task task = findById(taskId);
    task.setComplete(!task.getComplete());
    this.saveTask(task);
  }
  
  @Override
  public List<Task> findAll() {
    return taskRepository.findAllByOrderByIdAsc();
  }
  
  @Override
  public Task findById(Long id) {
    return taskRepository.findById(id).orElseThrow();
  }
  
}
