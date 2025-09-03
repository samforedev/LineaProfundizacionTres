package Entities;

import Enmus.JobAreas;
import Enmus.JobCharge;

import java.time.LocalDate;

public class Employee extends Person {
    public String employeeCode;
    public double overtime;
    public LocalDate registerDate;
    public JobAreas jobAreas;
    public JobCharge jobCharge;

    public Employee() {
        super();
    }
}
