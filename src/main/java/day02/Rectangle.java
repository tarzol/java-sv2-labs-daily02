package day02;

public class Rectangle {

    private double lineA;
    private double lineB;

    public Rectangle(double lineA, double lineB) {
        this.lineA = lineA;
        this.lineB = lineB;
    }

    public double calculateArea(){
        double area;
        return lineA*lineB;
    }
}
