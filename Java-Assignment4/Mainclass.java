class SuperCL {
    void display() {
        System.out.println("Super class");
    }
}

class SubCL extends SuperCL {
    void display() {
        System.out.println("Sub class");
    }
}

public class Mainclass {
    public static void main(String[] args) {
        SuperCL obj1 = new SuperCL();
        SuperCL obj2 = new SubCL();

        obj1.display();
        obj2.display();
    }
}