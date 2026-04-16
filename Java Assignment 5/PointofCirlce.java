class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void displayPoint() {
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }
}

class Circle {
    double radius;
    Point center;  

    Circle(int x, int y, double radius) {
        center = new Point(x, y);  
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void displayCircle() {
        center.displayPoint();
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + calculateArea());
    }
}

public class PointofCirlce {
    public static void main(String[] args) {
        Circle c = new Circle(3, 4, 5.0);

      
        c.displayCircle();
    }
}