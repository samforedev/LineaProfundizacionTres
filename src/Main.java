import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();
        int opt;

        do {
            System.out.println(" -------------------------------------------- ");
            System.out.println("Selecciona opcion:");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Retiro Rapido");
            System.out.println("5. Ver informacion");
            System.out.println("6. Salir");
            opt = sc.nextInt();
            int i = 1;
            int opt2;
            double balance;
            BankAccount selectedAccount;
            switch (opt) {
                case 1:
                    System.out.println("Crear cuenta: ");
                    System.out.print("Numero de cuenta: ");
                    String accountNumber = sc.next();
                    System.out.print("Numero de DNI: ");
                    String dniNumber = sc.next();
                    System.out.print("Numero de cuenta: ");
                    double accountBalance = sc.nextDouble();

                    BankAccount newAccount = new BankAccount(accountNumber, dniNumber, accountBalance);
                    accounts.add(newAccount);
                    System.out.println("Cuenta agregada con exito");

                    break;
                case 2:
                    if (accounts.isEmpty()) {
                        System.out.println("No hay ninguna cuenta");
                        break;
                    }
                    System.out.println("A que cuenta desea depositar");
                    for(BankAccount account : accounts) {
                        System.out.println(i+": " + account.getAccountNumber());
                        i++;
                    }
                    opt2 = sc.nextInt();
                    selectedAccount = accounts.get(opt2-1);
                    System.out.print("Cantida a depositar: ");
                    balance = sc.nextDouble();
                    selectedAccount.AddBalance(balance);
                    break;
                case 3:
                    if (accounts.isEmpty()) {
                        System.out.println("No hay ninguna cuenta");
                        break;
                    }
                    System.out.println("A que cuenta desea retirar");

                    for(BankAccount account : accounts) {
                        System.out.println(i+": " + account.getAccountNumber());
                        i++;
                    }
                    opt2 = sc.nextInt();
                    selectedAccount = accounts.get(opt2-1);
                    System.out.print("Cantida a retirar: ");
                    balance = sc.nextDouble();
                    selectedAccount.RemoveBalance(balance);
                    break;
                case 4:
                    if (accounts.isEmpty()) {
                        System.out.println("No hay ninguna cuenta");
                        break;
                    }
                    System.out.println("A que cuenta desea aplicar retiro rapido");

                    for(BankAccount account : accounts) {
                        System.out.println(i+": " + account.getAccountNumber());
                        i++;
                    }
                    opt2 = sc.nextInt();
                    selectedAccount = accounts.get(opt2-1);
                    selectedAccount.fastRemove();
                    break;

                case 5:
                    if (accounts.isEmpty()) {
                        System.out.println("No hay ninguna cuenta");
                        break;
                    }
                    System.out.println("Todas las cuentas");
                    for(BankAccount account : accounts) {
                        System.out.println(account.toString());
                    }
                    break;
                default:
                    break;
            }

        } while (opt != 6);

    }
}