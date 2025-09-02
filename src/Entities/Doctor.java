package Entities;

import Enmus.JobAreas;
import Enmus.JobCharge;
import Enmus.Service;
import Enmus.Specialty;
import Entities.Employees.PayrollEmployee;

import java.util.Date;

public class Doctor extends PayrollEmployee {
    public Specialty specialty;
    public Service service;
    public String officeNumber;

    public Doctor(String name, String DNINumber, String lastName, Date birthDate, String address, String city, String employeeCode, double overtime, Date registerDate, JobAreas jobAreas, JobCharge jobCharge, double salary, double percentageHourExtra, Specialty specialty, Service service, String officeNumber) {
        super(name, DNINumber, lastName, birthDate, address, city, employeeCode, overtime, registerDate, jobAreas, jobCharge, salary, percentageHourExtra);
        this.specialty = specialty;
        this.service = service;
        this.officeNumber = officeNumber;
    }
}
