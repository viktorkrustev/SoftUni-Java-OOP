package PolymorphismLab.Shapes;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5d, 6d);
        Shape circle = new Circle(7d);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
    }
}
