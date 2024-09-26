package edu.arthur.d05;
import java.util.Arrays;
import java.util.List;

// Desafio 5 - Calcule a média dos números maiores que 5:
// Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
public class CalcularMedia {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
 

    int soma = numeros.stream()
    .filter(n -> n > 5)
    .reduce(0, (n1, n2 ) -> n1 + n2);

    long count = numeros.stream()
    .filter(n -> n > 5)
    .count();

    double media = (count > 0) ? soma / count :  0;
    
    System.out.println(media);

    }
}
