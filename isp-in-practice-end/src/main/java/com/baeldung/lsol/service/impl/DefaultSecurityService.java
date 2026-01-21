package com.baeldung.lsol.service.impl;

import com.baeldung.lsol.domain.model.Worker;
import com.baeldung.lsol.service.SecurityService;
import com.baeldung.lsol.service.notification.SmsNotifier;

public class DefaultSecurityService implements SecurityService {

    private SmsNotifier smsNotifier;

    public DefaultSecurityService(SmsNotifier smsNotifier) {
        super();
        this.smsNotifier = smsNotifier;
    }

    @Override
    public void sendOtp(Worker worker) {
        smsNotifier.sendSms("0987654321", "Your OTP is 1234.");
    }
}