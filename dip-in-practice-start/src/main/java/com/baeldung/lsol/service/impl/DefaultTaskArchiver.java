package com.baeldung.lsol.service.impl;

import com.baeldung.lsol.domain.model.Task;
import com.baeldung.lsol.persistence.repository.impl.InMemoryTaskRepository;
import com.baeldung.lsol.service.TaskArchiver;

import java.util.List;

public class DefaultTaskArchiver implements TaskArchiver {

    private InMemoryTaskRepository inMemoryTaskRepository;

    public DefaultTaskArchiver() {
        super();
        this.inMemoryTaskRepository = new InMemoryTaskRepository();
    }

    @Override
    public void archiveOldTasks() {
        List<Task> tasks = inMemoryTaskRepository.findAll();
        // ... logic to identify old tasks and archive them
    }
}