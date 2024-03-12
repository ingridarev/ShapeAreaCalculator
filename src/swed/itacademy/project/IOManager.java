package swed.itacademy.project;

import java.util.Scanner;

public class IOManager {

    static final Scanner scanner = new Scanner(System.in);
    private static int shape;
    private static double data1;
    private static double data2;

    public static int getShape() {
        return shape;
    }

    public static double getData1() {
        return data1;
    }

    public static double getData2() {
        return data2;
    }

    public static void selectShape() throws UnknownShapeException {
        System.out.println("Select shape: ");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");

        shape = scanner.nextInt();
    }

    public static void inputData() throws UnknownShapeException {

        switch (shape) {
            case 1 -> {
                System.out.println("Enter square side length: ");
                data1 = scanner.nextDouble();
                break;
            }

            case 2 -> {
                System.out.println("Enter two sides of a triangle: ");
                data1 = scanner.nextDouble();
                data2 = scanner.nextDouble();
                break;
            }

            case 3 -> {
                System.out.println("Enter a radius of a circle: ");
                data1 = scanner.nextDouble();
                break;
            }

            default -> {
                scanner.close();
                throw new UnknownShapeException("Selection does not mach any number from the list.");
            }

        }
        scanner.close();
    }

    public static void printArea(String area) {
        System.out.println(area);
    }

   }
