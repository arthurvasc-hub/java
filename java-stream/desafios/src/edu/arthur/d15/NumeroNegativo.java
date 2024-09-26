package edu.arthur.d15;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

//Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
//Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
public class NumeroNegativo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream().filter(n -> n < 0).findAny().ifPresentOrElse(
                System.out::println, // O que fazer se encontrar um número negativo
                () -> System.out.println("Nenhum número negativo encontrado.") // O que fazer se não encontrar
        );
     long numerosNegativos = numeros.stream().filter(n -> n < 0).count();
     System.out.println("A seguir a quantidade de numeros negativos presentes na lista: " + numerosNegativos);
    }
}
