package com.helana.task.domain.dto;

import com.helana.task.domain.entity.TaskPriority;
import com.helana.task.domain.entity.TaskStatus;

import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title ,
        String description ,
        LocalDate dueDate,
        TaskPriority priority,
        TaskStatus status

        //we don't need validation here becasue it is just the Response (REST API Response)
) {
}
