public class BankAccount {
    private String accountNumber;
    private String clientDni;
    private Double currentBalance;

    public BankAccount(String accountNumber, String clientDni, Double currentBalance) {
        this.accountNumber = accountNumber;
        this.clientDni = clientDni;
        this.currentBalance = currentBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getClientDni() {
        return clientDni;
    }

    public void setClientDni(String clientDni) {
        this.clientDni = clientDni;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "bankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", clientDni='" + clientDni + '\'' +
                ", currentBalance='" + currentBalance + '\'' +
                '}';
    }


    public void AddBalance(Double balance) {
        this.currentBalance += balance;
        System.out.println("Saldo actual: " + this.currentBalance);
    }

    public void RemoveBalance(Double balance) {
        if (this.currentBalance < balance) {
            System.out.println("No tienes esa cantidad a retirar, se pondra en 0");
            this.currentBalance = 0.0;
            return;
        }
        this.currentBalance -= balance;
        System.out.println("Saldo actual: " + this.currentBalance);
    }

    public void fastRemove() {
        if (this.currentBalance <= 0) {
            System.out.println("No hay saldo disponible para retirar.");
            return;
        }

        double remove = this.currentBalance * 0.20;
        this.currentBalance -= remove;

        System.out.println("Se retiro el 20% del saldo: " + remove);
        System.out.println("Saldo actual: " + this.currentBalance);
    }

}
