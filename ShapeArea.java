class Shape {
    double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println("Area of shape: " + s.getArea());

        Rectangle r = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + r.getArea());
    }
}
