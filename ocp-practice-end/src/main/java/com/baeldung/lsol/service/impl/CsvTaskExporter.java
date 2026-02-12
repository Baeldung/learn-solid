package com.baeldung.lsol.service.impl;

import com.baeldung.lsol.domain.model.Task;
import com.baeldung.lsol.service.TaskExporter;

public class CsvTaskExporter extends TaskExporter {

    @Override
    protected String getPrefix() {
        return "id,name,status\n";
    }

    @Override
    protected String formatTask(Task task) {
        return String.format("%s,%s,%s".formatted(task.getId(), task.getName(), task.getStatus()));
    }

    @Override
    protected String getDelimiter() {
        return "\n";
    }

    @Override
    protected String getSuffix() {
        return "";
    }
}
