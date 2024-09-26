package edu.arthur.d02;

import java.util.Arrays;
import java.util.List;

// Desafio 2 - Imprima a soma dos números pares da lista:
// Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

public class somaPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    
    int numerosSomados = numeros.stream()
    .filter(n -> n % 2 == 0)
    .reduce(0, (a ,b) -> a + b);


        System.out.println("Resultado dos numeros da lista somados: " + numerosSomados);
    }
}
