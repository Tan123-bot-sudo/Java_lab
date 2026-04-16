class Demo {

    Demo() {
        System.out.println("hello");
    }

    Demo(int x) {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo(5);
    }
}