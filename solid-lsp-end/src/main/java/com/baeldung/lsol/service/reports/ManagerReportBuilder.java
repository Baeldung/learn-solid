package com.baeldung.lsol.service.reports;

import java.util.List;

import com.baeldung.lsol.domain.model.Task;

public interface ManagerReportBuilder<T> {
    void addTasksData(List<Task> tasks);
    void addWorkersData(List<Task> tasks);
    void addCampaignsData(List<Task> tasks);
    T obtainReport();
}
