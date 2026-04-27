import java.util.Scanner;

class EmployeeDetails {
    int emp_no;
    String name, dept;
    double basic, DA, HRA, gross;

    EmployeeDetails(int no, String n, String d, double b) {
        emp_no = no;
        name = n;
        dept = d;
        basic = b;
        DA = 0.1 * basic;
        HRA = 0.2 * basic;
        gross = basic + DA + HRA;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        EmployeeDetails[] e = new EmployeeDetails[n];

        for(int i=0;i<n;i++){
            e[i] = new EmployeeDetails(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
        }

        EmployeeDetails max = e[0];

        for(int i=1;i<n;i++){
            if(e[i].gross > max.gross)
                max = e[i];
        }

        System.out.println(max.name + " " + max.gross);
    }
}
