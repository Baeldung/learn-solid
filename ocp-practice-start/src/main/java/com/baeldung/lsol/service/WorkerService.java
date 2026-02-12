package com.baeldung.lsol.service;

import java.util.Optional;

import com.baeldung.lsol.domain.model.Worker;

public interface WorkerService {

    Optional<Worker> findById(Long id);

    Worker create(Worker worker);

    Optional<Worker> updateWorker(Long id, Worker worker);
}
