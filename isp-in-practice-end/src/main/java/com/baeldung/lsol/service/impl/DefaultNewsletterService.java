package com.baeldung.lsol.service.impl;

import com.baeldung.lsol.domain.model.Worker;
import com.baeldung.lsol.service.NewsletterService;
import com.baeldung.lsol.service.notification.EmailNotifier;

public class DefaultNewsletterService implements NewsletterService {

    private EmailNotifier emailNotifier;

    public DefaultNewsletterService(EmailNotifier emailNotifier) {
        super();
        this.emailNotifier = emailNotifier;
    }

    @Override
    public void sendWeeklyNews(Worker worker) {
        emailNotifier
          .sendEmail(worker.getEmail(), "Weekly News", "Nothing new happened this week.");
    }
}