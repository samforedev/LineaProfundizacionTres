package Entities.Employees;

import Enmus.JobAreas;
import Enmus.JobCharge;
import Entities.Person;

import java.util.Date;

public class Employee extends Person {
    public String employeeCode;
    public double overtime;
    public Date registerDate;
    public JobAreas jobAreas;
    public JobCharge jobCharge;

    public Employee() {
        super();
    }

    public Employee(String name, String DNINumber, String lastName, Date birthDate, String address, String city, String employeeCode, double overtime, Date registerDate, JobAreas jobAreas, JobCharge jobCharge) {
        super(name, DNINumber, lastName, birthDate, address, city);
        this.employeeCode = employeeCode;
        this.overtime = overtime;
        this.registerDate = registerDate;
        this.jobAreas = jobAreas;
        this.jobCharge = jobCharge;
    }


}
