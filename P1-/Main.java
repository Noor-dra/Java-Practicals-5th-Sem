
class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance >= 0 ? balance : 0;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Aman", 123456789, 5000);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(2000);
        account.deposit(-500);
        account.withdraw(1000);
        account.withdraw(0);
        account.withdraw(-200);
        account.withdraw(10000);

        System.out.println("Updated Balance: " + account.getBalance());
    }
}
