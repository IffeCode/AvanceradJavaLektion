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

        //Skriv rätt datatyp:

        int myVar1 = 99;
        double myVar2 = 3.14f;
        char myVar3 = 'A';
        boolean myVar4 = true;
        String myVar5 = "Hello, World!";

        double y = (double) 1 /3; //måste sätta double inom parantes framför.
        System.out.println("1/3 = " + y);

        double z = 0.1 +0.1 +0.1 +0.1 +0.1 +0.1 +0.1 +0.1 +0.1 +0.1; //?
        System.out.println("10 * 0,1 = " + z);

        //Konvertera:

        String string1 = "2.23";// till float
        String.valueOf(string1);
        String string2 = "false";// till boolean
        String.valueOf(string2);
        String string3 = "1337"; // till integer
        int stringInteger = Integer.parseInt(string3);
        System.out.println(string1 + " " + string2 + " " + " " + stringInteger);






    }
}
