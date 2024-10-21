package org.example;

import static org.example.Main.askForInput;

public class Rectangle {
    private static int length;
    private static int width;

// the methods:

// The constructors:
    public Rectangle() {
       this (4, 2);
    }

    public Rectangle(int length ) {
       width = length;
       Rectangle.length = length;
    }

    public Rectangle(int length, int width) {
        Rectangle.length = length;
        Rectangle.width = width;
    }

// Calculations:
    // Calculate the area of a rectangle with parameters
    public static int calculateArea() {
        return length * width;
    }

    // Calculate the area of a rectangle with properties
    public int calculateArea(int length, int width) {
        return length * width;
    }

    // Calculate the perimeter of a rectangle with parameters
    public static int calculatePerimeter() {
        return 2 * (length + width);
    }

    // Calculate the perimeter of a rectangle with properties
    public int calculatePerimeter(int length, int width) {
        return 2 * (length + width);
    }

    // Calculate how many times a rectangle fits into another rectangle
    public static double calculateRectangleFitsInAnotherRectangle(int length, int width){
        return (double) Rectangle.calculateArea() / Rectangle.calculateArea();
    }

    // Calculate the distance between the poles
    public static double calculateDistance() {
        double numberOfPoles = Double.parseDouble(askForInput("Enter the number of poles \n"));
            return calculatePerimeter() / numberOfPoles;
    }

    // Calculate the number of poles needed
    public static double calculateNumberOfPoles() {
        double distanceBetweenPoles = Double.parseDouble(askForInput(
            "Enter the preferred distance between the poles \n"));
        return  calculatePerimeter() / distanceBetweenPoles;
    }

// Setters and Getters:
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        Rectangle.length = length;
    }

    public void setWidth(int width) {
        Rectangle.width = width;
    }
}
