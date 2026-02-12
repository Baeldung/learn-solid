package com.baeldung.lsol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.baeldung.lsol.domain.model.Task;

public class CsvAndJsonTaskExporter {

    public String exportTasks(List<Task> tasks, String formatType) {
        switch (formatType) {
            case "CSV":
                String headers = "id,name,status";
                String csvData = tasks.stream()
                    .map(task -> String.format("%s,%s,%s", task.getId(), task.getName(), task.getStatus()))
                    .collect(Collectors.joining("\n"));
                return String.format("%s\n%s", headers, csvData);

            case "JSON":
                String jsonData = tasks.stream()
                    .map(task -> String.format("""
                        {
                            "id": %s,
                            "name": "%s",
                            "status": "%s"
                        }
                        """, task.getId(), task.getName(), task.getStatus()))
                    .collect(Collectors.joining(",\n"));
                return String.format("[\n%s\n]", jsonData);

            default:
                throw new IllegalArgumentException("Unsupported format type: " + formatType);
        }
    }
}