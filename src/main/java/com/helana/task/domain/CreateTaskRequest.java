package com.helana.task.domain;

import com.helana.task.domain.entity.TaskPriority;
import java.time.LocalDate;

public record CreateTaskRequest(
        String title ,
        String description ,
        LocalDate dueDate,
        TaskPriority priority
)
{

}
