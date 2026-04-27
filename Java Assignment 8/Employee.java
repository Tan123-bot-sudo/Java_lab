 class Employee {
    String name, dept;
    double salary;
    static String company = "ABC Ltd";

    Employee(String n, String d, double s) {
        name = n;
        dept = d;
        salary = s;
    }

    void display() {
        System.out.println(name+" "+dept+" "+salary+" "+company);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("A", "IT", 30000);
        Employee e2 = new Employee("B", "HR", 35000);
        Employee e3 = new Employee("C", "Sales", 28000);
        Employee e4 = new Employee("D", "IT", 40000);
        Employee e5 = new Employee("E", "HR", 32000);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
    }
}