package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

   List<String> persons = List.of("Andrei", "Farid", "Moa", "Aria", "Pelle", "Samuel", "Khadija");

   persons.stream()
           .filter( p -> p.length() > 4)
                   .toList();

        System.out.println(persons);



    }
}

