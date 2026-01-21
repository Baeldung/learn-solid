package com.baeldung.lsol.service.impl;

import com.baeldung.lsol.domain.model.Worker;
import com.baeldung.lsol.service.SecurityService;
import com.baeldung.lsol.service.notification.NotificationService;

public class DefaultSecurityService implements SecurityService {

    private NotificationService notificationService;

    public DefaultSecurityService(NotificationService notificationService) {
        super();
        this.notificationService = notificationService;
    }

    @Override
    public void sendOtp(Worker worker) {
        notificationService.sendSms("0987654321", "Your OTP is 1234.");
    }
}