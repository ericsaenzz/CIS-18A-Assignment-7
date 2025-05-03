public class RectangleTest {
    public static void main(String[] args) {
        // Create a Rectangle object with default constructor
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle 1:");
        System.out.printf("Length: %.2f%n", rectangle1.getlength());
        System.out.printf("Width: %.2f%n", rectangle1.getwidth());
        System.out.printf("Area: %.2f%n", rectangle1.getArea());
        System.out.printf("Perimeter: %.2f%n", rectangle1.getPerimeter());

        // Create a Rectangle object with parameterized constructor
        System.out.println("\nRectangle 2:");
        try {
            Rectangle rectangle2 = new Rectangle(10.5, 15.5);
            System.out.printf("Length: %.2f%n", rectangle2.getlength());
            System.out.printf("Width: %.2f%n", rectangle2.getwidth());
            System.out.printf("Area: %.2f%n", rectangle2.getArea());
            System.out.printf("Perimeter: %.2f%n", rectangle2.getPerimeter());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nTest for SET method:");
        Rectangle rectangle3 = new Rectangle();
        try {
            rectangle3.setLength(5.5);
            rectangle3.setWidth(7.5);
            System.out.printf("Length: %.2f%n", rectangle3.getlength());
            System.out.printf("Width: %.2f%n", rectangle3.getwidth());
            System.out.printf("Area: %.2f%n", rectangle3.getArea());
            System.out.printf("Perimeter: %.2f%n", rectangle3.getPerimeter());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("\nTest for INVALID input:");
        try {
            rectangle3.setLength(25.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}