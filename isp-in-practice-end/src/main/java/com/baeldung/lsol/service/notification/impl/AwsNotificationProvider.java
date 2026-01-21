package com.baeldung.lsol.service.notification.impl;

import com.baeldung.lsol.service.notification.EmailNotifier;
import com.baeldung.lsol.service.notification.SmsNotifier;

public class AwsNotificationProvider implements EmailNotifier, SmsNotifier {

    @Override
    public void sendEmail(String toAddress, String subject, String body) {
        // Logic to send email via AWS SES
    }

    @Override
    public void sendSms(String phoneNumber, String message) {
        // Logic to send SMS via AWS SNS
    }
}