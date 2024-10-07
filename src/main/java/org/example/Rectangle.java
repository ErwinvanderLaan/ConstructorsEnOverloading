package org.example;

import static org.example.Main.askForInput;

public class Rectangle {
    private int length;
    private int width;

// the methods:

// The constructors:
    public Rectangle() {
       this (4, 2);
    }

    public Rectangle(int length ) {
       width = length;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

// Calculations:
    // Calculate the area of a rectangle with parameters
    int calculateArea() {
        return this.length * this.width;
    }

    // Calculate the area of a rectangle with properties
    int calculateArea(int length, int width) {
        return length * width;
    }

    // Calculate the perimeter of a rectangle with parameters
    int calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

    // Calculate the perimeter of a rectangle with properties
    int calculatePerimeter(int length, int width) {
        return 2 * (length + width);
    }
    // Calculate the distance between the poles
    public double calculateDistance() {
        double numberOfPoles = Integer.parseInt(askForInput("Enter the number of poles \n"));
        Rectangle rectangle = new Rectangle();
        return rectangle.calculatePerimeter() / numberOfPoles;
    }

    // Calculate the number of poles needed
    public double calculateNumberOfPoles() {
        double distanceBetweenPoles = Double.parseDouble(askForInput(
            "Enter the preferred distance between the poles \n"));
        Rectangle rectangle = new Rectangle();
        return  rectangle.calculatePerimeter() / distanceBetweenPoles;
    }

// Setters and Getters:
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
