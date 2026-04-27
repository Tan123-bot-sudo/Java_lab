class Test {
    Test() {
        System.out.println("Default constructor");
    }

    Test(int x) {
        System.out.println("Parameterized constructor: " + x);
    }

    public static void main(String[] args) {
        Test d1 = new Test();
        Test d2 = new Test(5);
    }
}