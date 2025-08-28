public class BankProgram{

    // Bank class (Inner class)
    static class Bank{
        private String accountHolder;
        private double balance;

        // Constructor
        public Bank(String accountHolder, double initialBalance) {
            this.accountHolder = accountHolder;
            this.balance = initialBalance;
        }

        // Deposit money
        public void submit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("₹" + amount + " deposited.");
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        // Withdraw money
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("₹" + amount + " withdrawn.");
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        }

        // Check balance
        public void checkBalance() {
            System.out.println(accountHolder + "'s Current Balance: ₹" + balance);
        }
    }

    // Main method
    public static void main(String[] args){
        // Creating a bank account
        Bank account1 = new Bank("Shikhar Verma", 1000.0);

        // Performing operations
        account1.checkBalance();
        account1.submit(500.0);
        account1.withdraw(300.0);
        account1.checkBalance();
    }
}


