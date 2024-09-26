package edu.arthur.d18;
//Desafio 18 - Verifique se todos os números da lista são iguais:
//Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VerificarIguais {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosIguais = numeros.stream().distinct().count() == 1;

        System.out.println("Todos os numeros da array são iguais? :" + numerosIguais);
    }
}
