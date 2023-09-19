package Week_1;

public class BankAccount {
    private String accountName;
    private double balance;

    // Constructor to initialize the account
    public BankAccount(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    // Method to get the account balance
    public double getBalance() {
        return balance;
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Initialize three BankAccount objects with sample data
        BankAccount account1 = new BankAccount("John's Savings", 1000.0);
        BankAccount account2 = new BankAccount("Alice's Checking", 2500.0);
        BankAccount account3 = new BankAccount("Bob's Money Market", 5000.0);

        // Display account information
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        double bobBalance = account3.getBalance();
        System.out.println("Bob's account balance is $" + bobBalance);
    }
}

