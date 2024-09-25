package edu.arthur.consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerExample {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);

        //Consumer<Integer> numerosPares = n -> n % 2 == 0;

        numeros.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);
        }
    }
