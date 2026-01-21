package com.baeldung.lsol.persistence.repository;

import java.util.Optional;

import com.baeldung.lsol.domain.model.Worker;

public interface WorkerRepository {

    Optional<Worker> findById(Long id);

    Worker save(Worker worker);

}
