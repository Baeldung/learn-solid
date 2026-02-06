package com.baeldung.lsol.domain.model;

public class SalariedWorker extends Worker implements Payable {

    private double salaryBalance;

    public SalariedWorker(String email, String firstName, String lastName) {
        super(email, firstName, lastName);
    }

    @Override
    public void pay(double amount) {
        this.salaryBalance += amount;
    }

    @Override
    public double getSalaryBalance() {
        return salaryBalance;
    }
}