package edu.arthur.binaryOperator;

import java.util.Arrays;
import java.util.List;



public class BinaryOperator {
   public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);

    //BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

    Integer resultado = numeros.stream()
    .reduce(0, (num1, num2)-> num1 + num2);

    System.out.println(resultado);
   } 



}
