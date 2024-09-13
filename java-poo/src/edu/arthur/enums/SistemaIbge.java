package edu.arthur.enums;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadosBrasileiros e : EstadosBrasileiros.values()){
            System.out.println("Nome do estado: " + e.getNome() + " - SIGLA: " + e.getSigla());
        }

        EstadosBrasileiros eb = EstadosBrasileiros.CEARA;

        System.out.println(eb.getSigla() + " " + eb.getNome() + " " + eb.getNomeMaiusculo());

    }

}
