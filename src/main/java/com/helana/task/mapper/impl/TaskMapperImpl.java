package com.helana.task.mapper.impl;

import com.helana.task.domain.CreateTaskRequest;
import com.helana.task.domain.dto.CreateTaskRequestDto;
import com.helana.task.domain.dto.TaskDto;
import com.helana.task.domain.entity.Task;
import com.helana.task.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component //marks this class as a Bean
public class TaskMapperImpl implements TaskMapper {
    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescripton(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
