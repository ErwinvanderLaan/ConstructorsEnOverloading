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

        String choiceCircleOrRectangle = askForInput("Choose an option:");

        String adjustParameters = askForInput(
                "Do you want to adjust the parameters of the object? y / n ");
        if (adjustParameters.equals("y"))
            if (choiceCircleOrRectangle.equals("1")) {
                circle.setRadius(Double.parseDouble
                        (askForInput("Enter the radius:")));
            }
           if (adjustParameters.equals("2")) {
                rectangle.setLength(Integer.parseInt
                    (askForInput("Enter length")));
                rectangle.setWidth(Integer.parseInt
                    (askForInput("Enter width")));
                }
            else {
               System.out.println("Invalid choice. Please try again");
           }

        if (adjustParameters.equals("n")) {
            System.out.println("Using default values");
        }

        System.out.println("""
                        What do you want to calculate?
                            Press '1' to calculate the diameter ( circle only).
                            Press '2' to calculate the perimeter.
                            Press '3' to calculate the area.
                            Press '4' to calculate the number of poles needed.
                            Press '5' to calculate the distance between poles.
                        """);

        String choiceMenu = askForInput("Choose an option:");

                switch (choiceMenu) {
                    case "1":
                        System.out.println(circle.getDiameter() );
                        break;
                    case "2":
                        if (choiceCircleOrRectangle.equals("1") )
                            System.out.println(circle.getPerimeter() );
                        else
                            System.out.println(rectangle.calculatePerimeter() ) ;
                        break;
                    case "3":
                        if (choiceCircleOrRectangle.equals("1") )
                            System.out.println(circle.getArea() );
                        else
                            System.out.println(rectangle.calculateArea() );
                        break;
                    case "4":
                        if (choiceCircleOrRectangle.equals("1"))
                            System.out.println(circle.getNumberOfPoles() );
                        else
                            System.out.println(rectangle.calculateNumberOfPoles() );
                        break;
                    case "5":
                        if (choiceCircleOrRectangle.equals("1") )
                            System.out.println(circle.getDistance() );
                        else
                            System.out.println(rectangle.calculateDistance() );
                    default:
                        System.out.println("Invalid choice. Please try again");
                }
    }
}