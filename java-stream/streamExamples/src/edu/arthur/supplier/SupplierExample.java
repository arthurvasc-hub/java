package edu.arthur.supplier;
import java.util.*;
import java.util.stream.*;

public class SupplierExample {
    public static void main(String[] args) {
        // Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)";

        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo (a)")
        .limit(3)
        .toList();

        listaSaudacoes.forEach(System.out::println); // Method Reference
    }
}