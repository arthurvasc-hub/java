package edu.arthur.condicionais.Encandeadas;

public class ResultadoEscolar2 {
    public static void main(String[] args) {
        double nota = 5.6;
        
        if(nota >= 7)
            System.out.println("Você foi aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Você esta de recuperação");

        else
            System.out.println("Você foi reprovado");
    }
}
