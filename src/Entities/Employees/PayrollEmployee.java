package Entities.Employees;

import Enmus.JobAreas;
import Enmus.JobCharge;

import java.util.Date;

public class PayrollEmployee extends Employee {
    public double salary;
    public double percentageHourExtra;

    public PayrollEmployee(String name, String DNINumber, String lastName, Date birthDate, String address, String city, String employeeCode, double overtime, Date registerDate, JobAreas jobAreas, JobCharge jobCharge, double salary, double percentageHourExtra) {
        super(name, DNINumber, lastName, birthDate, address, city, employeeCode, overtime, registerDate, jobAreas, jobCharge);
        this.salary = salary;
        this.percentageHourExtra = percentageHourExtra;
    }
}
