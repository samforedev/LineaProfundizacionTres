import Entities.Doctor;
import Entities.Employees.Employee;
import Entities.Patient;
import Entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final List<Doctor> doctors = new ArrayList<Doctor>();
    private static final List<Employee> employees = new ArrayList<Employee>();
    private static final List<Patient> patients = new  ArrayList<Patient>();

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
                    PersonRegister();
                    break;
                case 2:
                    System.out.println("Este tambien es camelludo");
                    break;
                case 3:
                    System.out.println("Por ahora listaremos todos los medicos");
                    System.out.println("Medicos:" + doctors);
                case 4:
                    System.out.println("Este quedo tambien para mañana");

                default:
                    System.out.println("Pailas");
            }


        } while (option != 5);

        System.out.println("Hasta luego");
    }


    public static void PersonRegister() {
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


}