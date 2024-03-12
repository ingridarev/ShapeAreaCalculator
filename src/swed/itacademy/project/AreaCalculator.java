package swed.itacademy.project;

public class AreaCalculator {

    private static void runCalculator() throws UnknownShapeException {
        userInteraction();
        areaOutput();
    }

    public static void main(String[] args) throws UnknownShapeException {
        runCalculator();
    }

    private static void userInteraction() throws UnknownShapeException {
        IOManager.selectShape();
        try {
            IOManager.inputData();
        } catch (UnknownShapeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void areaOutput() {

        Shape myShape = null;

        switch (IOManager.getShape()) {
            case 1:
                myShape = new Square(IOManager.getData1());
                break;
            case 2:
                myShape = new Triangle(IOManager.getData1(), IOManager.getData2());
                break;
            case 3:
                myShape = new Circle(IOManager.getData1());
                break;
            default:
                System.out.println("Invalid shape selected.");
                break;
        }

        if (myShape != null) {
            myShape.calculateArea();
            IOManager.printArea(myShape.toString());
        }

    }
}

