package Lesson13;

public class Circle extends Figure {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {

        double power2 = 2;
        double S = Math.PI * Math.pow(radius, power2);
        System.out.println("The area of the circle is: " + S);
        return S;
    }
}

