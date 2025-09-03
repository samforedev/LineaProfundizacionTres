package Entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    public Patient patient;
    public Doctor doctor;
    public LocalDate date;
    public LocalTime hour;

    public Appointment() { }
}
