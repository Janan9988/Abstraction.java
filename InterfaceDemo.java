interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

// SavingsAccount implementing BankAccount interface
class SavingsAccount implements BankAccount {
    private double balance;
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

// CurrentAccount implementing BankAccount interface
class CurrentAccount implements BankAccount {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

// Main class to demonstrate the usage
 class InterfaceDemo {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(1000.0, 0.05);
        BankAccount currentAccount = new CurrentAccount(2000.0, 1000.0);

        // Perform operations on the accounts
        savingsAccount.deposit(500);
        currentAccount.withdraw(300);
        double savingsBalance = savingsAccount.getBalance();
        double currentBalance = currentAccount.getBalance();

        System.out.println("Savings Account Balance: " + savingsBalance);
        System.out.println("Current Account Balance: " + currentBalance);
    }
}
    

