package com.helana.task.service;

import com.helana.task.domain.CreateTaskRequest;
import com.helana.task.domain.entity.Task;

public interface TaskService {

    Task createTask(CreateTaskRequest request);

}
