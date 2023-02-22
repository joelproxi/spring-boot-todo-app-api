package com.proxidev.spring_todoapp_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proxidev.spring_todoapp_api.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
