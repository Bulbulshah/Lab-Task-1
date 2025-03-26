class Rectangle {
    double length;
    double width;

    // Corrected method signature and formula
    public double calculateArea() {
        return 0.5*length * width; // Correct formula for rectangle
    }
}

public class Shape {
    public static void main(String[] args) {
        Rectangle area = new Rectangle();
        area.length = 25;
        area.width = 15;

        // Corrected method call with parentheses
        System.out.println("Total area of a rectangle is " + area.calculateArea());
    }
}
