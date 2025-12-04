package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

   List<String> persons = List.of("Andrei", "Farid", "Moa", "Aria", "Pelle", "Samuel", "Khadija");

   persons.stream()
           .filter( p -> p.length() > 4)
           .forEach(System.out::println);


   List<String> words = List.of("Blue", "Black", "Hippopotamus", "Bird");
    words.stream()
            .map(w -> w.length())
            .forEach(System.out::println);


    List<Integer> numbers = List.of(1, 2, 3, 1, 5, 6, 2, 8, 9);
        HashSet<Integer> numberSet = new HashSet<>(numbers);
        numberSet.stream()
                .forEach(System.out::println);


        List<String> word = List.of("BOM!", "Blind", "Snake", "BOM!", "Beer", "Blind");
        //Order : Antal förekomster
        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String w : word) {
            Integer count = wordMap.getOrDefault(word, 0);
            count++;
            wordMap.put(w, count);
        }
        System.out.println(wordMap);







    }
}

