package com.baeldung.lsol.service.impl;

import java.util.List;
import java.util.Optional;

import com.baeldung.lsol.domain.model.Task;
import com.baeldung.lsol.domain.model.Worker;
import com.baeldung.lsol.service.ReportsService;
import com.baeldung.lsol.service.TaskService;
import com.baeldung.lsol.service.WorkerService;
import com.baeldung.lsol.service.reports.ManagerReportBuilder;
import com.baeldung.lsol.service.reports.WorkerReportBuilder;

public class DefaultReportsService implements ReportsService {

    private TaskService taskService;
    private WorkerService workerService;

    public DefaultReportsService(TaskService taskService, WorkerService workerService) {
        super();
        this.taskService = taskService;
        this.workerService = workerService;
    }

    @Override
    public <T> T generateWorkerReport(WorkerReportBuilder<T> builder, Long workerId) {
        List<Task> relevantTasks = taskService.searchTasks(null, workerId);

        Optional<Worker> requestingWorker = workerService.findById(workerId);
        builder.addSpecificWorkerData(requestingWorker.get());
        builder.addTasksData(relevantTasks);

        return builder.obtainReport();
    }

    @Override
    public <T> T generateManagerReport(ManagerReportBuilder<T> builder) {
        List<Task> relevantTasks = taskService.searchTasks(null, null);

        builder.addTasksData(relevantTasks);
        builder.addCampaignsData(relevantTasks);
        builder.addWorkersData(relevantTasks);

        return builder.obtainReport();
    }

}
