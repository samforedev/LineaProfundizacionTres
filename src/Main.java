import Entities.Dog;
import Utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        int opt;
        Dog tempDog = null;
        int tempId = 0;

        do {
            System.out.println(" ------------------------- REFUGIO DE ANIMALES ------------------- ");
            System.out.println("Selecciona opcion:");
            System.out.println("1. Agregar un perro");
            System.out.println("2. Buscar un perro por el ID");
            System.out.println("3. Registrar adopcion");
            System.out.println("4. Vacunar perro");
            System.out.println("5. Esterilizar perro");
            System.out.println("6. Listar perros disponibles");
            System.out.println("7. Eliminar perro por ID");
            System.out.println("8. Listar todos los perror");
            System.out.println("0. Salir");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    Dog newDog = Utils.addDog();
                    tempId = dogs.size();
                    newDog.setId(tempId+1);
                    dogs.add(newDog);
                    break;
                case 2:
                    Utils.showSelectedDog(dogs);
                    break;
                case 3:
                    System.out.print("Ingresa el id del perro que quieres adoptar: ");
                    tempId = sc.nextInt();
                    if (tempId > dogs.size()) {
                        System.out.println("No existe el perro que quieres buscar");
                        break;
                    }
                    tempDog = dogs.get(tempId - 1);
                    if (tempDog != null) {
                        if (tempDog.isAdopted()) {
                            System.out.println(" El perro ya fue adoptado ");
                            break;
                        }
                        System.out.print(" Ingresa tu Nombre: ");
                        tempDog.setAdoptiveParent(sc.nextLine());
                        tempDog.setAdopted(true);
                        System.out.println(tempDog.toString());
                        break;
                    }
                    System.out.println("No existe el perro que quieres buscar");
                    break;
                case 4:
                    System.out.print("Ingresa el id del perro que quieres Vacunar: ");
                    tempId = sc.nextInt();
                    if (tempId > dogs.size()) {
                        System.out.println("No existe el perro que quieres buscar");
                        break;
                    }
                    tempDog = dogs.get(tempId - 1);
                    if (tempDog != null) {
                        if (tempDog.isVaccine()) {
                            System.out.println(" El perro ya fue Vacunado ");
                            break;
                        }
                        tempDog.toVaccinate();
                        break;
                    }
                    System.out.println("No existe el perro que quieres buscar");
                    break;
                case 5:
                    System.out.print("Ingresa el id del perro que quieres Esterilizar: ");
                    tempId = sc.nextInt();
                    if (tempId > dogs.size()) {
                        System.out.println("No existe el perro que quieres buscar");
                        break;
                    }
                    tempDog = dogs.get(tempId - 1);
                    if (tempDog != null) {
                        if (tempDog.isSterilized()) {
                            System.out.println(" El perro ya fue Esterilizado ");
                            break;
                        }
                        tempDog.toSterilized();
                        break;
                    }
                    System.out.println("No existe el perro que quieres buscar");
                    break;
                case 6:
                    Utils.showNoAdoptDog(dogs);
                    break;
                case 7:
                    System.out.print("Ingresa el id del perro que quieres Eliminar: ");
                    tempId = sc.nextInt();
                    if (tempId > dogs.size()) {
                        System.out.println("No existe el perro que quieres buscar");
                        break;
                    }
                    tempDog = dogs.get(tempId - 1);
                    if (tempDog == null) {
                        System.out.println("El perro que quieres eliminar no existe");
                        break;
                    }
                    dogs.remove(tempDog);
                    break;
                case 8:
                    System.out.println("Lista de todos los perros: ");
                    for (Dog g : dogs) {
                        System.out.println(g.toString());
                    }
                default:
                    break;
            }

        } while (opt != 0);
    }
}