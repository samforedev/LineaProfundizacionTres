import Enmus.Specialty;
import Entities.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Doctor> doctors = new ArrayList<>();
    static List<Employee> employees = new ArrayList<>();
    static List<Patient> patients = new  ArrayList<>();
    static List<Appointment> appointments = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        do {
            System.out.println("---------- Ejercicio en clase ----------");
            System.out.println("1. Digita: 1 Para registrar datos");
            System.out.println("2. Digita: 2 Para registrar una cita medica");
            System.out.println("3. Digita: 3 Para listar los medicos por especialidad");
            System.out.println("4. Digita: 4 Para listar los datos de los pacientes atendidos por un medico");
            System.out.println("5. Digita: 5 Para salir");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    personRegister();
                    break;
                case 2:
                    assignMedicalAppointment();
                    break;
                case 3:
                    listDoctorsByFilters();
                case 4:
                    listPatientsByFilters();

                default:
                    System.out.println("Pailas");
            }


        } while (option != 5);

        System.out.println("Hasta luego");
    }


    private static void personRegister() {
        System.out.println("Bienvenido al registro de personas, aca podras registrar: \nEmpleados \nMedicos \nPacientes\n");
        int registerOption;
        do {
            System.out.println("1. Digita: 1 Para registrar Empleado");
            System.out.println("2. Digita: 2 Para registrar Medico");
            System.out.println("3. Digita: 3 Para registrar Paciente");
            System.out.println("4. Digita: 4 Para salir");
            registerOption = sc.nextInt();
            switch (registerOption) {
                case 1:
                    Employee employee = Utils.CreatePerson.createEmployee();
                    System.out.println("Haz creado: "+ employee.name);
                    employees.add(employee);
                    break;
                case 2:
                    Doctor doctor  = Utils.CreatePerson.createDoctor();
                    System.out.println("Haz creado: "+ doctor.name);
                    doctors.add(doctor);
                    break;
                case 3:
                    Patient patient = Utils.CreatePerson.createPatient();
                    System.out.println("Haz creado: "+ patient.name);
                    patients.add(patient);
                    break;
                default:
                    System.out.println("Pailas");
            }

        } while (registerOption != 4);
        System.out.println("Saliste de: Registrar una persona");
    }

    private static void assignMedicalAppointment() {
        if (patients.isEmpty() || doctors.isEmpty()) {
            System.out.println("hay que registrar");
            return;
        }

        System.out.println("Seleccionar paciente");
        for (int i = 0; i < patients.size(); i++) {
            System.out.println(i + ". " + patients.get(i).name + " " + patients.get(i).lastName);
        }
        int patientIndex = sc.nextInt();
        System.out.println(patientIndex);

        System.out.println("Seleccionar medico");
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println(i + ". " + doctors.get(i).name + " " + doctors.get(i).lastName);
        }
        int doctorIndex = sc.nextInt();
        System.out.println(doctorIndex);

        LocalDateTime appointmentDate = LocalDateTime.now();

        Appointment appointment = new Appointment();
        appointment.patient = patients.get(patientIndex);
        appointment.doctor = doctors.get(doctorIndex);
        appointment.date = appointmentDate.toLocalDate();
        appointment.hour = appointmentDate.toLocalTime();
        appointments.add(appointment);

        System.out.println("Cita ingresada");
    }

    private static void listDoctorsByFilters() {
        System.out.println("Indica la especialidad: \n 1. " + Specialty.OPHTHALMOLOGIST + "\n 2. " + Specialty.SURGEON );
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println(
                        doctors.stream()
                                .filter(doctor -> doctor.specialty == Specialty.OPHTHALMOLOGIST).toList()
                );
                break;
            case 2:
                System.out.println(
                        doctors.stream().filter(doctor -> doctor.specialty == Specialty.SURGEON).toList()
                );
                break;
            default:
                System.out.println("Error");
        }
    }

    private static void listPatientsByFilters() {
        System.out.println("Seleccionar medico");
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println(i + ". " + doctors.get(i).name + " " + doctors.get(i).lastName);
        }
        int doctorIndex = sc.nextInt();
        Doctor selectedDoctor = doctors.get(doctorIndex);

        int index = 0;
        for (var appointment : appointments) {
            if (appointment.doctor.employeeCode.equals(selectedDoctor.employeeCode)) {
                System.out.println(index + ". " + appointment.patient.name + " " + appointment.patient.lastName);
                index++;
            }
        }
    }


}