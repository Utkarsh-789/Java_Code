// Define the interface
interface Bank {
    void openAccount();
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

// Implement the interface in a class
class Bank1 implements Bank {
    private double balance = 0;

    public void openAccount() {
        System.out.println("Account opened successfully.");
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double checkBalance() {
        return balance;
    }
}

// Main class to test
public class BankInterfaceDemo {
    public static void main(String[] args) {
        Bank myBank = new Bank1();

        myBank.openAccount();
        myBank.deposit(1000);
        myBank.withdraw(500);
        System.out.println("Current Balance: ₹" + myBank.checkBalance());
    }
}
