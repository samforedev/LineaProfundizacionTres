package Entities;

import Enmus.Service;
import Enmus.Specialty;


public class Doctor extends PayrollEmployee {
    public Specialty specialty;
    public Service service;
    public String officeNumber;

    public Doctor() {
        super();
    }
}
