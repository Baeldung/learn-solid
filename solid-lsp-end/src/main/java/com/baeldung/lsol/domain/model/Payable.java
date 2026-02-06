package com.baeldung.lsol.domain.model;

public interface Payable {

    void pay(double amount);

    double getSalaryBalance();
}
