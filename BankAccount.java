import java.util.*;
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int n, String name, double b) {
        accountNumber = n;
        accountHolderName = name;
        balance = b;
    }

    void deposit(double a) {
        balance += a;
    }

    void withdraw(double a) {
        if (a <= balance)
            balance -= a;
        else
            System.out.println("Insufficient balance");
    }

    double checkBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account Number: ");
        int n = sc.nextInt();
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Balance: ");
        double b = sc.nextDouble();

        BankAccount a = new BankAccount(n, name, b);

        System.out.print("Deposit: ");
        a.deposit(sc.nextDouble());

        System.out.print("Withdraw: ");
        a.withdraw(sc.nextDouble());

        a.displayAccount();
    }
}