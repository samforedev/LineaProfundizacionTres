package Utils;

import Entities.Dog;
import Enums.DogSize;

import java.util.List;
import java.util.Scanner;

public class Utils {
    static Scanner sc = new Scanner(System.in);

    public static Dog addDog() {
        Dog newDog = new Dog();
        System.out.println("Estas agregando un perro, porfavor ingresa estos datos: ");
        System.out.print("Nombre: ");
        newDog.setName(sc.nextLine());
        System.out.print("Raza: ");
        newDog.setBreed(sc.nextLine());
        System.out.print("Edad: ");
        newDog.setAgeMonths(sc.nextInt());
        System.out.println("Tamaño: ");
        System.out.println("1. Pequeño");
        System.out.println("2. Mediano");
        System.out.println("3. Grande");
        newDog.setSize(chooseSize(sc.nextInt()));
        System.out.println("Estado de vacunacion: ");
        System.out.println("1. No vacunado");
        System.out.println("2. Vacunado");
        newDog.setVaccine(chooseBool(sc.nextInt()));
        System.out.println("Estado de esterilizacion: ");
        System.out.println("1. No Esterilizado");
        System.out.println("2. Esterilizado");
        newDog.setSterilized(chooseBool(sc.nextInt()));
        return newDog;
    }

    public static void showSelectedDog(List<Dog> dogs) {
        System.out.print("Ingresa el id del perro que quieres buscar: ");
        int id = sc.nextInt();
        if (id > dogs.size()) {
            System.out.println("No existe el perro que quieres buscar");
            return;
        }
        Dog dogFound = dogs.get(id - 1);
        if (dogFound != null) {
            System.out.println(dogFound.toString());
            return;
        }
        System.out.println("No existe el perro que quieres buscar");
    }

    public static void showNoAdoptDog(List<Dog> dogs) {
        List<Dog> noAdoptList = dogs.stream().filter(dog -> !dog.isAdopted()).toList();
        System.out.println("Lista de no adoptados");
        for (Dog d : noAdoptList) {
            System.out.println(d.toString());
        }
    }

    private static DogSize chooseSize(int opt) {
        switch (opt) {
            case 1:
                return DogSize.SMALL;
            case 2:
                return DogSize.MEDIUM;
            case 3:
                return DogSize.LARGE;
            default:
                return DogSize.NONE;
        }
    }

    private static boolean chooseBool(int opt) {
        return opt == 2;
    }

}
