package com.baeldung.lsol.service.impl;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.baeldung.lsol.domain.model.Task;
import com.baeldung.lsol.domain.model.TaskStatus;

class TaskExporterTest {

    private final List<Task> dummyTasks = List.of(aTask(1L, "Task 1", TaskStatus.TO_DO), aTask(2L, "Task 2", TaskStatus.IN_PROGRESS));

    @Test
    void whenExportTasksAsCSV_thenReturnsCorrectFormat() {
        CsvAndJsonTaskExporter exporter = new CsvAndJsonTaskExporter();

        String csv = exporter.exportTasks(dummyTasks, "CSV");

        assertTrue(csv.startsWith("id,name,status"));
        assertTrue(csv.contains("1,Task 1,TO_DO"));
        assertTrue(csv.contains("2,Task 2,IN_PROGRESS"));
    }

    @Test
    void whenExportTasksAsJSON_thenReturnsCorrectFormat() {
        CsvAndJsonTaskExporter exporter = new CsvAndJsonTaskExporter();

        String json = exporter.exportTasks(dummyTasks, "JSON");

        assertTrue(json.startsWith("["));
        assertTrue(json.endsWith("]"));
        assertTrue(json.contains("\"id\": 1"));
        assertTrue(json.contains("\"name\": \"Task 1\""));
        assertTrue(json.contains("\"status\": \"TO_DO\""));
        assertTrue(json.contains("\"id\": 2"));
        assertTrue(json.contains("\"name\": \"Task 2\""));
        assertTrue(json.contains("\"status\": \"IN_PROGRESS\""));
    }

    private static Task aTask(long id, String name, TaskStatus taskStatus) {
        Task task1 = new Task();
        task1.setId(id);
        task1.setName(name);
        task1.setStatus(taskStatus);
        return task1;
    }
}
