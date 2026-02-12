package com.baeldung.lsol.service;

import java.util.List;
import java.util.stream.Collectors;

import com.baeldung.lsol.domain.model.Task;

public abstract class TaskExporter {

    public final String export(List<Task> tasks) {
        String body = tasks.stream()
            .map(this::formatTask)
            .collect(Collectors.joining(getDelimiter()));

        return getPrefix() + body + getSuffix();
    }

    protected abstract String getPrefix();

    protected abstract String formatTask(Task task);

    protected abstract String getDelimiter();

    protected abstract String getSuffix();
}