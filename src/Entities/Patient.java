package Entities;

import Enmus.BloodType;
import Enmus.Gender;
import Entities.dto.Medications;

import java.util.Date;
import java.util.List;

public class Patient extends Person {
    public String medicalRecordNumber;
    public Gender gender;
    public BloodType bloodType;
    public List<Medications> medicationsAllergy;

    public Patient(String name, String DNINumber, String lastName, Date birthDate, String address, String city, String medicalRecordNumber, Gender gender, BloodType bloodType, List<Medications> medicationsAllergy) {
        super(name, DNINumber, lastName, birthDate, address, city);
        this.medicalRecordNumber = medicalRecordNumber;
        this.gender = gender;
        this.bloodType = bloodType;
        this.medicationsAllergy = medicationsAllergy;
    }
}
