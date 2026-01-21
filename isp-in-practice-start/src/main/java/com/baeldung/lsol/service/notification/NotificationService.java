package com.baeldung.lsol.service.notification;

public interface NotificationService {
    void sendEmail(String toAddress, String subject, String body); 
    void sendSms(String phoneNumber, String message); 
}