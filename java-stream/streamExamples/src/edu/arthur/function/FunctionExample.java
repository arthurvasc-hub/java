package edu.arthur.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,10,25);

    Function<Integer, Integer> dobrar = n -> n * 2;


    List<Integer> numerosDobrados = numeros.stream()
    .map(dobrar)
    .toList();

    numerosDobrados.forEach(n -> System.out.println(n));
    }
}
