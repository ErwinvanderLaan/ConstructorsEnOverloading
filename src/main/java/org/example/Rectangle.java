package org.example;

public class Rectangle {
    private int length;
    private int width;

// the methods:

    // The constructors:

    public Rectangle() {
        int length = 4;
        int width = 2;
    }

    public Rectangle(int length) {
        int width = length;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Calculate the area of a rectangle with parameters
    int calculateArea() {
        return length * width;
    }

    // Calculate the area of a rectangle with properties
    int calculateArea(int length, int width) {
        return length * width;
    }

    // Calculate the circumference of a rectangle with parameters
    int calculateCircumference() {
        return 2 * (length + width);
    }

    // Calculate the circumference of a rectangle with properties
    int calculateCircumference(int length, int width) {
        return 2 * (length + width);
    }

    // Calculate how many times another rectangle fits into the current rectangle
    double fitsIn(){
        Rectangle rec1 = new Rectangle();

        return
    }
}