package edu.arthur.d17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//Desafio 17 - Filtrar os números primos da lista:
//Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
public class NumerosPrimos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Numeros primos: ");
        numeros.stream().filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(i -> n % i == 0)).forEach(System.out::println);

    }
}

