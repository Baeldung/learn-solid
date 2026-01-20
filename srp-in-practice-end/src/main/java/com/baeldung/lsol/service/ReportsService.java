package com.baeldung.lsol.service;

import com.baeldung.lsol.service.reports.ManagerReportBuilder;
import com.baeldung.lsol.service.reports.WorkerReportBuilder;

public interface ReportsService {

    public <T> T generateWorkerReport(WorkerReportBuilder<T> builder, Long workerId);

    public <T> T generateManagerReport(ManagerReportBuilder<T> builder);
}
