package Entities.Employees;

import Enmus.JobAreas;
import Enmus.JobCharge;

import java.util.Date;

public class TemporaryEmployee extends Employee{
    public double hourlyFee;
    public double jobHours;
    public Date contractTerminationDate;

    public TemporaryEmployee(String name, String DNINumber, String lastName, Date birthDate, String address, String city, String employeeCode, double overtime, Date registerDate, JobAreas jobAreas, JobCharge jobCharge, double hourlyFee, double jobHours, Date contractTerminationDate) {
        super(name, DNINumber, lastName, birthDate, address, city, employeeCode, overtime, registerDate, jobAreas, jobCharge);
        this.hourlyFee = hourlyFee;
        this.jobHours = jobHours;
        this.contractTerminationDate = contractTerminationDate;
    }
}
