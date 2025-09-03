package Utils;

import Enmus.*;
import Entities.Doctor;
import Entities.Employees.Employee;
import Entities.Patient;
import Entities.dto.Medications;

import java.util.ArrayList;
import java.util.Date;

public class CreatePerson {

    public static Employee createEmployee() {
        return new Employee(
                "Pedro",
                "1234566",
                "Pascal",
                new Date(),
                "Nunca jamas",
                "Chia",
                "EM-001",
                12.2,
                new Date(),
                JobAreas.ADMINISTRATIVE,
                JobCharge.SUPERVISOR
        );
    }

    public static Patient createPatient() {
        return new Patient(
                "Pepito",
                "987654",
                "Perez",
                new Date(),
                "Nunca jamas",
                "Chia",
                "MRN-001",
                Gender.MALE,
                BloodType.ANegative,
                new ArrayList<Medications>()
        );
    }

    public static Doctor createDoctor(){
        return new Doctor(
                "Doc Bobadilla",
                "1234566",
                "Pascal",
                new Date(),
                "Nunca jamas",
                "Chia",
                "EM-001",
                12.2,
                new Date(),
                JobAreas.ADMINISTRATIVE,
                JobCharge.SUPERVISOR,
                200.2,
                7,
                Specialty.SURGEON,
                Service.OPHTHALMOLOGIST,
                "202"
        );
    }
}
