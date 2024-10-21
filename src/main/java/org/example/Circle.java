package org.example;

import static org.example.Main.askForInput;

public class Circle {
  private static double radius;

// The constructors:
  public Circle(){
    radius = 8.0;
  }

  public Circle(double radius){
    Circle.radius = radius;
  }

// The calculations:

  // Calculate the diameter of a circle
  public static double getDiameter(){
    return 2 * radius;
  }

  // Calculate the diameter of a circle with parameters
  public double getDiameter (double radius){
    return 2 * radius;
  }

  // Calculate the perimeter of a circle
  public static double getPerimeter() {
    return 2 * Math.PI * radius;
}

  // Calculate the perimeter of a circle with parameters
  public double getPerimeter (double radius) {
    return 2 * Math.PI * radius;
  }

  // Calculate the area of a circle
  public static double getArea() {
    return Math.PI * radius * radius;
  }
  // Calculate the area of a circle with parameters
  public double getArea (double radius) {
    return Math.PI * radius * radius;
  }

  // Calculate the distance between the poles
  public static double getDistanceBetweenPoles() {
    int numberOfPoles = Integer.parseInt(askForInput("Enter the number of poles \n"));
        return getPerimeter() / numberOfPoles;
  }

// Calculate the number of poles needed
  public static double getNumberOfPoles() {
    double distanceBetweenPoles = Double.parseDouble(askForInput(
        "Enter the preferred distance between the poles \n"));
      return getPerimeter() / distanceBetweenPoles;
  }


// Getters & Setters
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    Circle.radius = radius;
  }
}
