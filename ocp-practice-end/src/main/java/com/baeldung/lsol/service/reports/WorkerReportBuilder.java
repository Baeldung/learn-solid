package com.baeldung.lsol.service.reports;

import java.util.List;

import com.baeldung.lsol.domain.model.Task;
import com.baeldung.lsol.domain.model.Worker;

public interface WorkerReportBuilder<T> {
    void addTasksData(List<Task> tasks);
    void addSpecificWorkerData(Worker worker);
    T obtainReport();
}
