import java.util.Scanner;

class Commission {
    double sales;

    Commission(double sales) {
        this.sales = sales;
    }

    double commission() {
        if(sales <= 10000) return sales * 0.1;
        else if(sales <= 50000) return sales * 0.15;
        else return sales * 0.2;
    }
}

public class TestCommission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sales = sc.nextDouble();

        if(sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission c = new Commission(sales);
            System.out.println(c.commission());
        }
    }
}