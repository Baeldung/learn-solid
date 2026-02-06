package com.baeldung.lsol;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.baeldung.lsol.domain.model.Payable;
import com.baeldung.lsol.domain.model.SalariedWorker;
import com.baeldung.lsol.domain.model.Volunteer;
import com.baeldung.lsol.domain.model.Worker;

class SolidUnitTest {

    @Test
    public void givenWorker_whenGetWorkerData_thenDataIsAccessible() {
        // salaried worker
        Worker worker = new SalariedWorker("john@doe.com", "John", "Doe");
        assertEquals("John", worker.getFirstName());

        // volunteer, same logic
        Worker volunteer = new Volunteer("jane@doe.com", "Jane", "Doe");
        assertEquals("Jane", volunteer.getFirstName());
    }

    @Test
    public void givenPayableList_whenProcessingPayroll_thenAllGetPaid() {
        Payable payable = new SalariedWorker("john@doe.com", "John", "Doe");
        // Payable payable = new Volunteer("john@doe.com", "John", "Doe"); // wouldn't compile; Volunteer is not Payable
        payable.pay(1000.00);
        payable.pay(500);

        assertEquals(1500D, payable.getSalaryBalance());
    }
    
// does't apply any more; Worker doesn't have a pay() method    
//    @Test
//    public void givenWorker_whenPaying_thenThrowsException() { 
//        Worker newHire = new Volunteer("john@doe.com", "John", "Doe");
//        assertThrows(UnsupportedOperationException.class, () -> newHire.pay(1000.00));
//    }
}