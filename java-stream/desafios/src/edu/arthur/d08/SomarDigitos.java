package edu.arthur.d08;

import java.util.Arrays;
import java.util.List;

//Desafio 8 - Somar os dígitos de todos os números da lista:
//Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

public class SomarDigitos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Somar todos os dígitos dos números na lista
       System.out.println("Soma dos numeros da lista é : " + numeros.stream()
       .reduce(0, Integer::sum));

       // Somar todos os dígitos dos números na lista
       int somaDosDigitos = numeros.stream()
       .flatMapToInt(n -> String.valueOf(n) // Converte o número para string
           .chars() // Obtém os caracteres da string
           .map(Character::getNumericValue)) // Converte os caracteres de volta para inteiros
       .sum(); // Soma todos os dígitos

        // Exibir o resultado
        System.out.println("A soma de todos os dígitos é: " + somaDosDigitos);
    }
}
