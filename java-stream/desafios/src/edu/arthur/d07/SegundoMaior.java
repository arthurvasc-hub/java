package edu.arthur.d07;
import java.util.Arrays;
import java.util.List;

// Desafio 7 - Encontrar o segundo número maior da lista:
// Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

public class SegundoMaior {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer segundoMaior = numeros.stream()
        .distinct()
        .sorted((n1, n2) -> n2.compareTo(n1))
        .skip(1)
        .findFirst()
        .orElse(null);
        
        System.out.println("Segundo maior numero da lista é : " + segundoMaior);
        


    }
}
