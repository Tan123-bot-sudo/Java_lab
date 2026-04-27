class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if(amount <= balance)
            balance -= amount;
    }

    void displayBalance() {
        System.out.println(accountNumber+" "+balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String acc, double bal, double rate) {
        super(acc, bal);
        interestRate = rate;
    }

    void addInterest() {
        balance += balance * interestRate / 100;
    }
}

class FixedDepositAccount extends SavingsAccount {
    int maturityPeriod;

    FixedDepositAccount(String acc, double bal, double rate, int period) {
        super(acc, bal, rate);
        maturityPeriod = period;
    }

    double calculateMaturityAmount() {
        return balance + (balance * interestRate * maturityPeriod / 100);
    }

    public static void main(String[] args) {
        FixedDepositAccount obj = new FixedDepositAccount("12345", 10000, 5, 12);

        obj.deposit(2000);
        obj.addInterest();
        obj.displayBalance();
        System.out.println(obj.calculateMaturityAmount());
    }
}
