package com.proxidev.spring_todoapp_api.controller;

import com.proxidev.spring_todoapp_api.models.Task;
import com.proxidev.spring_todoapp_api.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;
    @GetMapping("/")
    public Iterable<Task> getTasks(){
        return taskRepository.findAll();
    }


}
