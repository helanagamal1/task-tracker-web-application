package com.helana.task.service;

import com.helana.task.domain.CreateTaskRequest;
import com.helana.task.domain.entity.Task;
import java.util.List;
public interface TaskService {

    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();
}
