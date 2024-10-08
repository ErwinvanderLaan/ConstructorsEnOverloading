package org.example;

import java.util.Scanner;

public class Main {

    // Scanner method to ask for user input.
    public static String askForInput (String question){
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.next();
    }

    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        System.out.println("""
            Welcome to the mathematical calculator.
            With it you can make a number of calculations with circles and rectangles.
            Do you want to work with circles or rectangles?
            Press '1' for circles.
            Press '2' for rectangles.
            """);

        String choice1 = askForInput("Choose an option:");

        switch (choice1) {
            case "1":
                System.out.println("""
                        What do you want to calculate?
                            Press '1' to calculate the diameter of the circle.
                            Press '2' to calculate the perimeter of the circle.
                            Press '3' to calculate the area of the circle.
                            Press '4' to calculate the number of poles needed.
                            Press '5' to calculate the distance between poles.
                        """);

                String choice2 = askForInput("Choose an option:");

                switch (choice2) {
                    case "1":
                        circle.getDiameter();
                        break;
                    case "2":
                        circle.getPerimeter();
                        break;
                    case "3":
                        circle.getArea();
                        break;
                    case "4":
                        circle.getNumberOfPoles();
                        break;
                    case "5":
                        circle.getDistance();
                    default:
                        System.out.println("Invalid choice. Please try again");
                }

            case "2":
                System.out.println("""
                        What do you want to calculate?
                            Press '1' to calculate the perimeter of the rectangle.
                            Press '2' to calculate the area of the rectangle.
                            Press '3' to calculate the number of poles needed.
                            Press '4' to calculate the distance between poles.
                        """);

                String choice3 = askForInput("Choose an option:");

                switch (choice3) {
                    case "1":
                        rectangle.calculateArea();
                        break;
                    case "2":
                        rectangle.calculatePerimeter();
                        break;
                    case "3":
                        rectangle.calculateNumberOfPoles();
                        break;
                    case "4":
                        rectangle.calculateDistance();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again");
                }

        }
    }
}