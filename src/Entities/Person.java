package Entities;

import java.util.Date;

public class Person {
    public String DNINumber;
    public String Name;
    public String LastName;
    public Date BirthDate;
    public String Address;
    public String City;

    public Person(String name, String dniNumber, String lastName, Date birthDate, String address, String city) {
        Name = name;
        DNINumber = dniNumber;
        LastName = lastName;
        BirthDate = birthDate;
        Address = address;
        City = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "DNINumber='" + DNINumber + '\'' +
                ", Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", BirthDate=" + BirthDate +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}


