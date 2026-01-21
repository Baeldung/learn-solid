package com.baeldung.lsol.service;

import com.baeldung.lsol.domain.model.Worker;

public interface NewsletterService {
    void sendWeeklyNews(Worker worker);
}