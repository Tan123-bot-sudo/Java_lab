class Area_method {

    void Area(int a) {
        System.out.println("Area of square: " + a * a);
    }

    void Area(int l, int b) {
        System.out.println("Area of rectangle: " + l * b);
    }

    void Area(double base, double height) {
        System.out.println("Area of triangle: " + (0.5 * base * height));
    }

    public static void main(String[] args) {
        Area_method obj = new Area_method();

        obj.Area(5);          // square
        obj.Area(4, 6);       // rectangle
        obj.Area(3.0, 4.0);   // triangle
    }
}

