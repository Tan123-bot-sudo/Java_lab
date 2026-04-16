import java.util.Scanner;

class Tender {
    String company;
    double price;

    void getData(Scanner sc) {
        System.out.print("Enter Company Name: ");
        company = sc.next();  
        System.out.print("Enter Costing: ");
        price = sc.nextDouble();
    }

    void putData() {
        System.out.println(company + "\t" + price);
    }
}

public class tenderprogram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender[] items = new Tender[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            items[i] = new Tender();
            System.out.println("\nItem " + (i + 1) + ":");
            items[i].getData(sc);
        }

        System.out.println("\nCompany\tCosting");
        for (int i = 0; i < 5; i++) {
            items[i].putData();
            total += items[i].price;
        }

        System.out.println("Total\t" + total);

        sc.close();
    }
}
