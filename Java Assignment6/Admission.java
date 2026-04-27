import java.util.*;

interface Department {
    String deptName = "CSE";
    String deptHead = "Dr. Sharma";

    void printDeptDetails();
}

class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    void getHostelData(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();
        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();
        System.out.print("Enter Number of Rooms: ");
        numberOfRooms = sc.nextInt();
        sc.nextLine();
    }

    void printHostelData() {
        System.out.println("Hostel: " + hostelName + ", " + hostelLocation + ", Rooms: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName;
    int regdNo;
    String electiveSubject;
    double avgMarks;

    void getData(Scanner sc) {
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Enter Regd No: ");
        regdNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.nextLine();
        System.out.print("Enter Avg Marks: ");
        avgMarks = sc.nextDouble();
        sc.nextLine();

        getHostelData(sc);
    }

    void printData() {
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Regd No: " + regdNo);
        System.out.println("Subject: " + electiveSubject);
        System.out.println("Marks: " + avgMarks);
        printHostelData();
        printDeptDetails();
    }

    public void printDeptDetails() {
        System.out.println("Department: " + deptName + ", Head: " + deptHead);
    }
}

public class Admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Admit 2.Migrate 3.Display 4.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                Student s = new Student();
                s.getData(sc);
                list.add(s);
            } else if (ch == 2) {
                System.out.print("Enter Regd No: ");
                int reg = sc.nextInt();
                for (Student s : list) {
                    if (s.regdNo == reg) {
                        list.remove(s);
                        System.out.println("Student Migrated");
                        break;
                    }
                }
            } else if (ch == 3) {
                for (Student s : list) {
                    s.printData();
                }
            } else break;
        }
    }
}