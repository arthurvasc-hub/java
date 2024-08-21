package edu.arthur.Tipos_e_Variaveis;
public class TiposVariaveis {
    public static void main (String[] args) throws Exception {
        double salarioMinimo = 2500;
        double bonusSalarial = 0.5; 

        double salarioReal = salarioFinal(salarioMinimo, bonusSalarial);
        System.out.println(salarioReal);
    }
    public static double salarioFinal(double salarioMinimo, double bonusSalarial) {
    return (salarioMinimo * bonusSalarial) + salarioMinimo;
    }

    short numeroCurto = 1;
    int numeroNomal = numeroCurto;
    short numeroNormal2 = (short) numeroNomal; // Error de CASTING
}

