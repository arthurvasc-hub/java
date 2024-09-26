package edu.arthur.d04;

import java.util.Arrays;
import java.util.List;

// Desafio 4 - Remova todos os valores ímpares:
// Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.

public class RemoverImpar {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        System.out.println("Nova lista sem os numeros impares: ");
        
        // Criando uma nova lista sem os numeros impares
        List<Integer> novaLista = numeros.stream()
        .filter(n -> n % 2 == 0)
        .toList();
        System.out.println(novaLista);
        
        /* -Forma sem modificar a lista 
         numeros.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);
        */
    }
}
