package edu.arthur.d10;
import java.util.Arrays;
import java.util.List;


//Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
//Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
public class AgruparValores {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


       List<Integer> listaImpares = numeros.stream()
        .distinct()
        .sorted()
        .filter(n -> n % 3 == 0 || n % 5 == 0)
        .toList();

        System.out.println("Lista com os numeros ímpares múltiplos de 3 ou 5: " + listaImpares);
        
    }
}
