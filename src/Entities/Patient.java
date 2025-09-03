package Entities;

import Enmus.BloodType;
import Enmus.Gender;

import java.util.List;

public class Patient extends Person {
    public String medicalRecordNumber;
    public Gender gender;
    public BloodType bloodType;
    public List<String> medicationsAllergy;

    public Patient() {
        super();
    }
}
