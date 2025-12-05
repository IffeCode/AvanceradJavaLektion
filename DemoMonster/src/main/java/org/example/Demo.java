package org.example;

import singleton.SingletonDemo;

import java.util.Scanner;

public class Demo {
    static void main(String[] args) {

        System.out.println("""
                1. Singleton
                Välj demo: """);
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        try {
            choice = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Ogiltig inmatning");
            return;
        }

        switch(choice) {
            case 1:
                SingletonDemo.Demo();
                break;
            default:
                System.out.println("Ogiltigt val!");
        }

    }
}
