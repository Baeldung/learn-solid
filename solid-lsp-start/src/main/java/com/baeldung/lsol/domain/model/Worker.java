package com.baeldung.lsol.domain.model;

import java.util.Objects;

public class Worker {

    private Long id;

    private String email;

    private String firstName;

    private String lastName;

    private double salaryBalance;

    public Worker(String email, String firstName, String lastName) {
        this(email, firstName, lastName, 0);
    }

    public Worker(String email, String firstName, String lastName, double salaryBalance) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryBalance = salaryBalance;
    }

    public Worker() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void pay(double amount) {
        this.salaryBalance += amount;
    }

    public double getSalaryBalance() {
        return salaryBalance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Worker other = (Worker) obj;
        return Objects.equals(email, other.email);
    }

    @Override
    public String toString() {
        return "Worker [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

}
