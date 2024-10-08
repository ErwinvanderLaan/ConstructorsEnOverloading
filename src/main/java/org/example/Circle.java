package org.example;

import static org.example.Main.askForInput;

public class Circle {
  private double radius;

// The constructors:
  public Circle(){
    this.radius = 8.0;
  }

  public Circle(double radius){
    this.radius = radius;
  }

// The calculations:

  // Calculate the diameter of a circle
  public double getDiameter (){
    return 2 * this.radius;
  }

  // Calculate the diameter of a circle with parameters
  public double getDiameter (double radius){
    return 2 * radius;
  }

  // Set a new diameter for the circle
  public double newDiameter (double x){
    return x = this.radius;
  }

  // Calculate the perimeter of a circle
  public double getPerimeter () {
    return 2 * Math.PI * this.radius;
}

  // Calculate the perimeter of a circle with parameters
  public double getPerimeter (double radius) {
    return 2 * Math.PI * radius;
  }

  // Calculate the area of a circle
  public double getArea () {
    return Math.PI * this.radius * this.radius;
  }
  // Calculate the area of a circle with parameters
  public double getArea (double radius) {
    return Math.PI * radius * radius;
  }

  // Calculate the distance between the poles
  public double getDistance () {
    int numberOfPoles = Integer.parseInt(askForInput("Enter the number of poles \n"));
        Circle circle = new Circle();
        return circle.getPerimeter() / numberOfPoles;
  }

// Calculate the number of poles needed
  public double getNumberOfPoles () {
    double distanceBetweenPoles = Double.parseDouble(askForInput(
        "Enter the preferred distance between the poles \n"));
    Circle circle = new Circle();
      return  circle.getPerimeter() / distanceBetweenPoles;
  }


// Getters & Setters
  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}
