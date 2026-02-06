package com.baeldung.lsol;

import com.baeldung.lsol.persistence.repository.TaskRepository;
import com.baeldung.lsol.persistence.repository.impl.InMemoryTaskRepository;
import com.baeldung.lsol.service.TaskArchiver;
import com.baeldung.lsol.service.impl.DefaultTaskArchiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LsolApp {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LsolApp.class);
        logger.info("Running Learn SOLID Principles App");

        TaskRepository taskRepository = new InMemoryTaskRepository();

        TaskArchiver taskArchiver = new DefaultTaskArchiver(taskRepository);
        taskArchiver.archiveOldTasks();
    }
}