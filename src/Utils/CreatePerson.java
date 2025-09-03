package Utils;

import Enmus.*;
import Entities.Doctor;
import Entities.Employee;
import Entities.Patient;
import Entities.Person;

import java.time.LocalDate;
import java.util.*;

public class CreatePerson {

    static Scanner sc = new Scanner(System.in);

    public static Employee createEmployee() {
        Person person = createPerson();
        System.out.println("================ Ingresa los datos del empleado ================");
        Employee employee = new Employee();
        employee.dniNumber = person.dniNumber;
        employee.name = person.name;
        employee.lastName = person.lastName;
        employee.birthDate = person.birthDate;
        employee.address = person.address;
        employee.city = person.city;
        System.out.print("Codigo de empleado: ");
        employee.employeeCode = sc.nextLine();
        System.out.print("Horas extra: ");
        employee.overtime = sc.nextDouble();
        employee.registerDate = LocalDate.now();
        System.out.println("Area de trabajo: \n 1." + JobAreas.ADMINISTRATIVE + "\n 2." + JobAreas.MEDICINE + "\n 3." + JobAreas.OTHER);
        System.out.print("Selecciona: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                employee.jobAreas = JobAreas.ADMINISTRATIVE;
                break;
            case 2:
                employee.jobAreas = JobAreas.MEDICINE;
                break;
            case 3:
                employee.jobAreas = JobAreas.OTHER;
                break;
        }
        System.out.println("Cargo de trabajo: \n 1." + JobCharge.SUPERVISOR + "\n 2." + JobCharge.ADMINISTRATIVE + "\n 3." + JobCharge.OTHER);
        System.out.print("Selecciona: ");
        int opTwo = sc.nextInt();
        switch (opTwo) {
            case 1:
                employee.jobCharge = JobCharge.SUPERVISOR;
                break;
            case 2:
                employee.jobCharge = JobCharge.ADMINISTRATIVE;
                break;
            case 3:
                employee.jobCharge = JobCharge.OTHER;
                break;
        }
        return employee;
    }

    public static Patient createPatient() {
        int option;
        List<String> medications = new ArrayList<>();
        Person person = createPerson();
        System.out.println("================ Ingresa los datos del paciente ================");
        Patient patient = new Patient();
        patient.dniNumber = person.dniNumber;
        patient.name = person.name;
        patient.lastName = person.lastName;
        patient.birthDate = person.birthDate;
        patient.address = person.address;
        patient.city = person.city;
        System.out.print("Numero de historia clinica: ");
        patient.medicalRecordNumber = sc.nextLine();
        System.out.println("Genero: \n 1." + Gender.MALE + "\n 2." + Gender.FEMALE);
        System.out.print("Selecciona Genero: ");
        option = sc.nextInt();
        switch (option) {
            case 1:
                patient.gender = Gender.MALE;
                break;
            case 2:
                patient.gender = Gender.FEMALE;
                break;
            default:
                System.out.println("Solo hay dos generos");
                break;
        }
        System.out.println("Grupo sanguineo: " +
                "\n 1." + BloodType.ANegative +
                "\n 2." + BloodType.APositive +
                "\n 3." + BloodType.BNegative +
                "\n 4." + BloodType.BPositive);

        System.out.print("Selecciona Grupo Sanguineo: ");
        option = sc.nextInt();
        switch (option) {
            case 1:
                patient.bloodType = BloodType.ANegative;
                break;
            case 2:
                patient.bloodType = BloodType.APositive;
                break;
            case 3:
                patient.bloodType = BloodType.BNegative;
                break;
            case 4:
                patient.bloodType = BloodType.BPositive;
                break;
            default:
                System.out.println("Sangre sucia");
                break;
        }
        String flag = "";
        System.out.println("Alergico a los medicamentos");
        System.out.println("Escribe 'N' para salir");
        while (!Objects.equals(flag, "N")) {
            System.out.print("Medicamento: ");
            flag = sc.nextLine();
            medications.add(flag);
        }

        patient.medicationsAllergy = medications;

        return patient;
    }

    public static Doctor createDoctor(){
        int option;
        Doctor doctor = new Doctor();
        Employee employee = createEmployee();
        doctor.dniNumber = employee.dniNumber;
        doctor.name = employee.name;
        doctor.lastName = employee.lastName;
        doctor.birthDate = employee.birthDate;
        doctor.address = employee.address;
        doctor.city = employee.city;
        doctor.employeeCode = employee.employeeCode;
        doctor.overtime = employee.overtime;
        doctor.registerDate = employee.registerDate;
        doctor.jobAreas = employee.jobAreas;
        doctor.jobCharge = employee.jobCharge;
        System.out.println("================ Ingresa los datos del Doctor ================");
        System.out.println("Especialidades: \n 1." + Specialty.SURGEON + "\n 2." + Specialty.OPHTHALMOLOGIST);
        System.out.print("Selecciona: ");
        option = sc.nextInt();
        switch (option) {
            case 1:
                doctor.specialty = Specialty.SURGEON;
                break;
            case 2:
                doctor.specialty = Specialty.OPHTHALMOLOGIST;
                break;
            default:
                break;
        }
        System.out.println("Servicios: \n 1." + Service.OPHTHALMOLOGIST + "\n 2." + Service.SURGERY+ "\n 3." + Service.OTHER);
        System.out.print("Selecciona: ");
        option = sc.nextInt();
        switch (option) {
            case 1:
                doctor.service = Service.OPHTHALMOLOGIST;
                break;
            case 2:
                doctor.service = Service.SURGERY;
                break;
            case 3:
                doctor.service = Service.OTHER;
            default:
                break;
        }
        System.out.print("Numero consultorio: ");
        doctor.officeNumber = sc.nextLine();
        System.out.print("Salario: ");
        doctor.salary = sc.nextDouble();
        System.out.print("Porcentaje de hora extra: ");
        doctor.percentageHourExtra = sc.nextDouble();

        return doctor;
    }

    private static Person createPerson() {
        Person person = new Person();
        System.out.println("================ Ingresa los datos de la Persona ================");
        System.out.print("DNI: ");
        person.dniNumber = sc.nextLine();
        System.out.print("Nombre: ");
        person.name = sc.nextLine();
        System.out.print("Apellido: ");
        person.lastName = sc.nextLine();
        person.birthDate = LocalDate.now();
        System.out.print("Dirreccion: ");
        person.address = sc.nextLine();
        System.out.print("Ciudad: ");
        person.city = sc.nextLine();
        return person;
    }

}
