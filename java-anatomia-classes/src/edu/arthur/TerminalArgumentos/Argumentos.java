package edu.arthur.TerminalArgumentos;

import java.util.Locale;
import java.util.Scanner;

public class Argumentos {
        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
           
           System.out.println("Digite seu nome: ");
           String nome = scanner.next();

           System.out.println("Digite seu Sobrenome: ");
           String sobrenome = scanner.next();

           System.out.println("Digite sua idade: ");
           int idade = scanner.nextInt();

           System.out.println("Digite sua altura");
           double altura = scanner.nextDouble();


           System.out.println("Olá, meu nome é: " + nome + " " + sobrenome);
           System.out.println("Tenho " + idade + " anos de idade");
           System.out.println("E tenho " + altura + "cm de altura");
        }
}
