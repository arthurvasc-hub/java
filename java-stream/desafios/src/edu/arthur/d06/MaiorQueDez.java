package edu.arthur.d06;

import java.util.Arrays;
import java.util.List;

// Desafio 6 - Verificar se a lista contém algum número maior que 10:
// Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
public class MaiorQueDez {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    long MaiorQueDez = numeros.stream()
    .filter(n -> n > 10)
    .count();

    System.out.println("Essa é a quantidade de numeros maiores que 10 na lista : " + MaiorQueDez);


    }
    
}
