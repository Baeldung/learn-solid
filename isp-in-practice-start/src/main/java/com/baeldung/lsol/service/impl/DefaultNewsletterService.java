package com.baeldung.lsol.service.impl;

import com.baeldung.lsol.domain.model.Worker;
import com.baeldung.lsol.service.NewsletterService;
import com.baeldung.lsol.service.notification.NotificationService;

public class DefaultNewsletterService implements NewsletterService {

    private NotificationService notificationService;

    public DefaultNewsletterService(NotificationService notificationService) {
        super();
        this.notificationService = notificationService;
    }

    @Override
    public void sendWeeklyNews(Worker worker) {
        notificationService
          .sendEmail(worker.getEmail(), "Weekly News", "Nothing new happened this week.");
    }
}