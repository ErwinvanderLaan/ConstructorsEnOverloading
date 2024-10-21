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


        while( true) {
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
            if (adjustParameters.equals("y")) {
                if (choiceCircleOrRectangle.equals("1")) {
                    circle.setRadius(Double.parseDouble(askForInput("Enter the radius:")));
                } else {
                    rectangle.setLength(Integer.parseInt(askForInput("Enter length")));
                    rectangle.setWidth(Integer.parseInt(askForInput("Enter width")));
                }
            }

            System.out.println("""
                What do you want to calculate?
                    Press '1' to calculate the diameter (circle only).
                    Press '2' to calculate the perimeter.
                    Press '3' to calculate the area.
                    Press '4' to calculate how many times a rectangle fits in the current
                              rectangle.
                    Press '5' to calculate the number of poles needed.
                    Press '6' to calculate the distance between poles.
                    Press 'q' to quit.
                """);

            String choiceMenu = askForInput("Choose an option:");

            switch (choiceMenu) {
                case "1":
                    System.out.println(Circle.getDiameter());
                    break;
                case "2":
                    if (choiceCircleOrRectangle.equals("1"))
                        System.out.println(Circle.getPerimeter());
                    else
                        System.out.println(Rectangle.calculatePerimeter());
                    break;
                case "3":
                    if (choiceCircleOrRectangle.equals("1"))
                        System.out.println(Circle.getArea());
                    else
                        System.out.println(Rectangle.calculateArea());
                    break;
                case "4":
                    System.out.println(Rectangle.calculateRectangleFitsInAnotherRectangle(8,12));
                    break;
                case "5":
                    if (choiceCircleOrRectangle.equals("1"))
                        System.out.println(Circle.getNumberOfPoles());
                    else
                        System.out.println(Rectangle.calculateNumberOfPoles());
                    break;
                case "6":
                    if (choiceCircleOrRectangle.equals("1"))
                        System.out.println(Circle.getDistanceBetweenPoles());
                    else
                        System.out.println(Rectangle.calculateDistance());
                case "q":
                    return ;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }
}