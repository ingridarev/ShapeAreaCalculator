package swed.itacademy.project;

public class Square extends Shape {

    public Square(double sideOne) {
        super(sideOne, sideOne);
    }

    @Override
    public void calculateArea() {
        super.rectangleArea();
    }
}
