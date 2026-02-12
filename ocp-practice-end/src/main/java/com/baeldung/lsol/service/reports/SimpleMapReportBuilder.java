package com.baeldung.lsol.service.reports;

import java.util.List;
import java.util.Map;

import com.baeldung.lsol.domain.model.Task;
import com.baeldung.lsol.domain.model.Worker;

public class SimpleMapReportBuilder extends MapReportBuilder
    implements WorkerReportBuilder<Map<String, Object>>, ManagerReportBuilder<Map<String, Object>> {

    @Override
    public void addWorkersData(List<Task> tasks) {
        super.workersCount.accept(tasks);
    }

    @Override
    public void addCampaignsData(List<Task> tasks) {
        super.totalCampaignsCount.accept(tasks);
    }

    @Override
    public void addTasksData(List<Task> tasks) {
        super.overDueTasksCount.accept(tasks);
        super.inProgressTasksCount.accept(tasks);
    }

    @Override
    public void addSpecificWorkerData(Worker worker) {
        super.workerName.accept(worker);
    }

}
