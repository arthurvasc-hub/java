package edu.arthur.predicate;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Arthur", "Vasconcelos","Victor", "Bruno", "Eliesita", "Hermildo");

        //Predicate<String> condicaoPredicate = n -> n.length() >= 6;

        nomes.stream()
        .filter(n -> n.length() >= 6)
        .toList()
        .forEach(System.out::println);
    
    
    }
   


}
