package com.lh.software.chorehive.api.core.repository;

import com.lh.software.chorehive.api.core.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
