package swed.itacademy.project;

public class Triangle extends Shape {

    public Triangle(double sideOne, double sideTwo) {
        super(sideOne, sideTwo);
    }

    @Override
    public void calculateArea() {
        super.rectangleArea();
        super.setArea(super.getArea()/2);
    }
}
