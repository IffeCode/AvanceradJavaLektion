package org.example;

import com.sun.jdi.DoubleValue;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        System.out.println("What is the radius?");

        double radius;
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();

        final double pi = 3.1415;

        double circumference = 2 * pi * radius;
        System.out.println("The circumference is: " + circumference);

        double circleArea = pi * Math.pow(radius, 2);
        System.out.println("The circle area is: " + circleArea);

        double volume = 4/3 * pi * Math.pow(radius, 3);
        System.out.println("The volume is: " + volume);

        System.out.println("What is the height of your cylinder?");

        double height;
        height = sc.nextDouble();
        double cylinderVolume = pi * Math.pow(radius, 2) * height;
        System.out.println("The cylinder volume is: " + cylinderVolume);






    }
}
