package com.baeldung.lsol;

import com.baeldung.lsol.persistence.repository.TaskRepository;
import com.baeldung.lsol.service.TaskArchiver;
import com.baeldung.lsol.service.impl.DefaultTaskArchiver;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SolidUnitTest {

    @Test
    void givenMockedRepository_whenArchiveOldTasks_thenRepositoryIsCalled() {
        TaskRepository taskRepository = Mockito.mock(TaskRepository.class);
        TaskArchiver taskArchiver = new DefaultTaskArchiver(taskRepository);

        taskArchiver.archiveOldTasks();

        Mockito.verify(taskRepository).findAll();
    }
}