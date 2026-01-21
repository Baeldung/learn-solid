package com.baeldung.lsol.service;

import com.baeldung.lsol.domain.model.Worker;

public interface SecurityService {
    void sendOtp(Worker worker);
}