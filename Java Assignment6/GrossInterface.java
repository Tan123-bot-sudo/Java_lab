interface Gross {
    double calculateGross();
}

class Employee {
    String name;
    double basic;

    Employee(String n, double b) {
        name = n;
        basic = b;
    }
}

class Salary extends Employee implements Gross {
    Salary(String n, double b) {
        super(n, b);
    }

    public double calculateGross() {
        return basic + (0.2 * basic) + (0.1 * basic);
    }

    void display() {
        System.out.println(name + " Gross Salary: " + calculateGross());
    }
}

public class GrossInterface {
    public static void main(String[] args) {
        Salary s = new Salary("Tanisha", 20000);
        s.display();
    }
}