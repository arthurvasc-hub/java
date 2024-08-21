package edu.arthur.Tipos_e_Variaveis;
public class TiposVariaveis {
    public static void main (String[] args) throws Exception {
        
        double anoNascimento = 1999.1;
        int anoMultiplacado = 2;
        double multiplicacao = salarioFinal(anoNascimento, anoMultiplacado);
        System.out.println(multiplicacao);   
    }

    public static double salarioFinal(double x, int y) {
    return (x * y) + x;
    }

}

