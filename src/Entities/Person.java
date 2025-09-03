package Entities;

import java.util.Date;

public class Person {
    public String dniNumber;
    public String name;
    public String lastName;
    public Date birthDate;
    public String address;
    public String city;

    public Person() {}
    public Person(String name, String dniNumber, String lastName, Date birthDate, String address, String city) {
        this.name = name;
        this.dniNumber = dniNumber;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "DNINumber='" + dniNumber + '\'' +
                ", Name='" + name + '\'' +
                ", LastName='" + lastName + '\'' +
                ", BirthDate=" + birthDate +
                ", Address='" + address + '\'' +
                ", City='" + city + '\'' +
                '}';
    }
}


