import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1234567", "0909102", 15000.0);
        BankAccount account2 = new BankAccount("54334", "423441", 2234422.4);
        BankAccount account3 = new BankAccount("091035", "321651", 34345432.0);

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);

        int opt;
        do {
            System.out.println(" -------------------------------------------- ");
            System.out.println("Selecciona opcion:");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Retiro Rapido");
            System.out.println("4. Ver informacion");
            System.out.println("5. Salir");
            opt = sc.nextInt();
            int i = 1;
            int opt2;
            double balance;
            BankAccount selectedAccount;
            switch (opt) {
                case 1:
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
                case 2:
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
                case 3:
                    System.out.println("A que cuenta desea aplicar retiro rapido");

                    for(BankAccount account : accounts) {
                        System.out.println(i+": " + account.getAccountNumber());
                        i++;
                    }
                    opt2 = sc.nextInt();
                    selectedAccount = accounts.get(opt2-1);
                    selectedAccount.fastRemove();
                    break;

                case 4:
                    System.out.println("Todas las cuentas");
                    for(BankAccount account : accounts) {
                        System.out.println(account.toString());
                    }
                    break;
                default:
                    break;
            }

        } while (opt != 5);

    }
}