/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bata
 */
public class radius {
  private double radius;
    private final double pi = 22.0 / 7.0;  // Approximation of π

    
    public Circle(double r) {
        this.radius = r;
    }

   
    public double calculateArea() {
        return pi * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * pi * radius;
    }

    // Main method to prompt user input and display the re
   
}
