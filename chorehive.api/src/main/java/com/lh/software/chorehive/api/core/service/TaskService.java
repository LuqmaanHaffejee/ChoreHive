package com.lh.software.chorehive.api.core.service;

import com.lh.software.chorehive.api.core.domain.Task;

import java.util.List;

public interface TaskService {
  
  Task saveTask(Task task);
  
  void toggleCompletion(Long taskId);
  
  List<Task> findAll();
  
  Task findById(Long id);
  
  Task addNewTask(Task task);
  
}
