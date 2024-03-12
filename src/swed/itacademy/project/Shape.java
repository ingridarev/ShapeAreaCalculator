package swed.itacademy.project;

public abstract class Shape {

    private double area;
    private double sideOne;
    private double sideTwo;


    public Shape(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public abstract void calculateArea();

    public void rectangleArea() {
       this.area = this.sideOne * this.sideTwo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                '}';
    }
}
