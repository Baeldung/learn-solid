package com.baeldung.lsol.service.notification;

public interface EmailNotifier {
    void sendEmail(String toAddress, String subject, String body); 
}
