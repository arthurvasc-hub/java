package edu.arthur.Operadores;

public class Operadores {
    public static void main(String[] args) {
     int a, b, c ;
    a = 6;
    b = 1;
    c = 6;
    boolean simNao = b == a;
    System.out.println("Numero 1 é igual ao numero 2?: " + simNao);
    simNao = c > a;
    System.out.println("Numero 1 é maior que o numero 2?: " + simNao);
    simNao = a == c;
    System.out.println("Numero 1 é igual numero 2?: " + simNao);
    simNao = a != c;
    System.out.println("Numero 1 é diferente do numero 2?: " + simNao);

    String resultado = ((c * b) == a) ? "Verdadeiro" : "Falso";
        System.out.println("c * b é igual a 6?: " + resultado);
    }
    
   
}
