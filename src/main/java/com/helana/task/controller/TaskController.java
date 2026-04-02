package com.helana.task.controller;


import com.helana.task.domain.CreateTaskRequest;
import com.helana.task.domain.dto.CreateTaskRequestDto;
import com.helana.task.domain.dto.TaskDto;
import com.helana.task.domain.entity.Task;
import com.helana.task.mapper.TaskMapper;
import com.helana.task.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//to tell spring to look here for the various different endpoints for REST API
@RequestMapping(path = "/api/v1/tasks")
public class TaskController {

    private final TaskService taskService;
    private final TaskMapper taskMapper;

    public TaskController(TaskService taskService, TaskMapper taskMapper) {
        this.taskService = taskService;
        this.taskMapper = taskMapper;
    }


        //Create Task Endpoint
@PostMapping
public ResponseEntity<TaskDto>  createTask(
 @Valid @RequestBody CreateTaskRequestDto createTaskRequestDto
   //this is the obj that represents the request to create a new task that has all info we need
){
    CreateTaskRequest createTaskRequest= taskMapper.fromDto(createTaskRequestDto);
    Task task =taskService.createTask(createTaskRequest);
    TaskDto createdTaskDto= taskMapper.toDto(task);
    return new ResponseEntity<>(createdTaskDto, HttpStatus.CREATED);
}




}
