import Enmus.Service;
import Enmus.Specialty;
import Entities.Doctor;
import Entities.Employees.Employee;
import Entities.Patient;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Doctor> doctors = new ArrayList<>();
    private static final List<Employee> employees = new ArrayList<>();
    private static final List<Patient> patients = new  ArrayList<>();

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
                    System.out.println("Este quedo tambien para mañana");

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
                    System.out.println("Haz creado: "+ employee);
                    employees.add(employee);
                    break;
                case 2:
                    Doctor doctor  = Utils.CreatePerson.createDoctor();
                    System.out.println("Haz creado: "+ doctor);
                    doctors.add(doctor);
                    break;
                case 3:
                    Patient patient = Utils.CreatePerson.createPatient();
                    System.out.println("Haz creado: "+ patient);
                    patients.add(patient);
                    break;
                default:
                    System.out.println("Pailas");
            }

        } while (registerOption != 4);
        System.out.println("Saliste de: Registrar una persona");
    }

    private static void assignMedicalAppointment() {
        Employee employee = employees.getFirst();
        Doctor doctor = doctors.getFirst();
        System.out.println("Bienvenido al registro de citas medicas");
        boolean finish = false;
        int option;
        do {
            Date date = new Date();
            String serviceName;
            System.out.println("Empleado -> Le atiende: " + employee.name + " con codigo: " + employee.employeeCode);
            System.out.println("Indica el servicio: \n 1. " + Service.OPHTHALMOLOGIST + "\n 2. " + Service.SURGERY + "\n 3. " + Service.OTHER);
            option = sc.nextInt();
            System.out.println("Empleado -> Cita agendada \n Detalle:");
            System.out.println("Medico: " + doctor.name);
            System.out.println("Fecha: " + date);
            System.out.println("Hora: " + date);
            switch (option) {
                case 1:
                    serviceName = Service.OPHTHALMOLOGIST.name();
                    finish = true;
                    break;
                case 2:
                    serviceName = Service.SURGERY.name();
                    finish = true;
                    break;
                case 3:
                    serviceName = Service.OTHER.name();
                    finish = true;
                    break;
                default:
                    System.out.println("Error");
                    serviceName = "Error";
            }
            System.out.println("Servicio: " + serviceName);
            var patient = Utils.CreatePerson.createPatient();
            patients.add(patient);
        } while (!finish);
    }

    private static void listDoctorsByFilters() {
        int option;
        do {
            System.out.println("Indica la especialidad: \n 1. " + Specialty.OPHTHALMOLOGIST + "\n 2. " + Specialty.SURGEON );
            System.out.println("3. Digita: 3 Para salir");
            option = sc.nextInt();
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
        } while (option != 3);
    }


}