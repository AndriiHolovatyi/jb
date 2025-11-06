package Lesson13;

public class Square extends Figure {

    private final double sideSqr;

    public Square(double sideSqr) {
        this.sideSqr = sideSqr;
    }

    @Override
    public double getArea(){


        double S = sideSqr*sideSqr;
        System.out.println("The area of the square is: " + S);
        return S;
    }
}
