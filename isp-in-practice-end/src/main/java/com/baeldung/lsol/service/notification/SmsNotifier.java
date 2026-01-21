package com.baeldung.lsol.service.notification;

public interface SmsNotifier {
    void sendSms(String phoneNumber, String message); 
}