package com.helana.task.mapper;

import com.helana.task.domain.CreateTaskRequest;
import com.helana.task.domain.dto.CreateTaskRequestDto;
import com.helana.task.domain.dto.TaskDto;
import com.helana.task.domain.entity.Task;

public interface TaskMapper {

CreateTaskRequest fromDto(CreateTaskRequestDto dto);
                     //mapping from PresentationLayer Request
// to ServiceLayer Request



    TaskDto toDto(Task task);
    //mapping Response of service layer  to Response of ppt layer
}

