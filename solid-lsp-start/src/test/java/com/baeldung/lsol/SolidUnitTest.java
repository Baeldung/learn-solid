package com.baeldung.lsol;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.baeldung.lsol.domain.model.Volunteer;
import com.baeldung.lsol.domain.model.Worker;

class SolidUnitTest {

    @Test
    public void givenWorker_whenGetWorkerData_thenDataIsAccessible() {
        Worker worker = new Worker("john@doe.com", "John", "Doe");
        assertEquals("John", worker.getFirstName());
    }

    @Test
    public void givenWorker_whenPaying_thenBalanceUpdates() {
        Worker worker = new Worker("john@doe.com", "John", "Doe");
        worker.pay(1000);
        worker.pay(500);
        assertEquals(1500D, worker.getSalaryBalance());
    }
    
    @Test
    public void givenWorker_whenPaying_thenThrowsException() {
        Worker newHire = new Volunteer("john@doe.com", "John", "Doe");
        assertThrows(UnsupportedOperationException.class, () -> newHire.pay(1000.00));
    }
}