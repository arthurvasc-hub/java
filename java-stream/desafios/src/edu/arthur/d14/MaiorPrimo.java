package edu.arthur.d14;

//Desafio 14 - Encontre o maior número primo da lista:
//Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MaiorPrimo {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n))
                        .noneMatch(i -> n % i == 0))
                .max(Integer::compare)
                .ifPresent(System.out::println);

    }
}
