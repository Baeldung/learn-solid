package com.baeldung.lsol.domain.model;

public class Volunteer extends Worker {

    public Volunteer(String email, String firstName, String lastName) {
        super(email, firstName, lastName);
    }

    @Override
    public void pay(double amount) {
        throw new UnsupportedOperationException("Volunteers do not receive payment!");
    }
}