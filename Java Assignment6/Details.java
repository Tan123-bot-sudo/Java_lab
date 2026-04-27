import java.util.Scanner;

interface Exam {
    void percent_cal();
}

class Student {
    private String name;
    private int roll_no;
    private int marks1, marks2;

    void getData(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        roll_no = sc.nextInt();
        System.out.print("Enter Marks1 (0-100): ");
        marks1 = sc.nextInt();
        System.out.print("Enter Marks2 (0-100): ");
        marks2 = sc.nextInt();
        sc.nextLine();  // Consume newline
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }

    // Getters for subclass access
    protected int getMarks1() { return marks1; }
    protected int getMarks2() { return marks2; }
}

class Result extends Student implements Exam {
    private double per;

    @Override
    public void percent_cal() {
        per = (getMarks1() + getMarks2()) / 2.0;
    }

    void display() {
        show();
        System.out.printf("Percentage: %.2f%%\n", per);
    }
}

public class Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();
        r.getData(sc);
        r.percent_cal();
        r.display();
        sc.close();
    }
}