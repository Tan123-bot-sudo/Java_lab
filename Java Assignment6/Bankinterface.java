interface Bank {
    void deposit(double amt);
    void withdraw(double amt);
}

class Customer {
    String name;

    Customer(String n) {
        name = n;
    }
}

class Account extends Customer implements Bank {
    double balance;

    Account(String n, double b) {
        super(n);
        balance = b;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt;
    }

    void display() {
        System.out.println(name + " Balance: " + balance);
    }
}

public class Bankinterface {
    public static void main(String[] args) {
        Account a = new Account("Tanisha", 1000);
        a.deposit(500);
        a.withdraw(200);
        a.display();
    }
}