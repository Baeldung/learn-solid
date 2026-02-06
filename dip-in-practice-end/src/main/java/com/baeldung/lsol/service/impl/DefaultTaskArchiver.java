package com.baeldung.lsol.service.impl;

import com.baeldung.lsol.domain.model.Task;
import com.baeldung.lsol.persistence.repository.TaskRepository;
import com.baeldung.lsol.service.TaskArchiver;

import java.util.List;

public class DefaultTaskArchiver implements TaskArchiver {

    private TaskRepository taskRepository;

    public DefaultTaskArchiver(TaskRepository taskRepository) {
        super();
        this.taskRepository = taskRepository;
    }

    @Override
    public void archiveOldTasks() {
        List<Task> tasks = taskRepository.findAll();
        // ... logic to identify old tasks and archive them
    }
}