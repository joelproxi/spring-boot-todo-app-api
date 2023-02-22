package com.proxidev.spring_todoapp_api;

import com.proxidev.spring_todoapp_api.models.Task;
import com.proxidev.spring_todoapp_api.repository.TaskRepository;
import jakarta.persistence.Temporal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringTodoappApiApplication implements CommandLineRunner {
	@Autowired
	private TaskRepository taskRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringTodoappApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Task task1 = new Task(null, "Go to the market", new Date(2076), true);
		Task task2 = new Task(null, "Go to the water", new Date(2076), true);
		Task task3 = new Task(null, "Go to the route", new Date(2076), true);

		taskRepository.saveAll(List.of(task1, task2, task3));

		List<Task> tasks = taskRepository.findAll();
		tasks.forEach(task -> System.out.println(task));
	}
}
