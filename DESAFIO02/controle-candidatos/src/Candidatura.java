import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Locale;
import java.util.Random;
import java.util.ArrayList;


public class Candidatura {
    public static void main(String[] args) throws Exception {
        String[] candidatos = {"ANA", "EVA", "HELENA", "JULIA", "LEONARDO"};
        for(String candidato: candidatos){
        entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else 
                System.out.println("Contato realizado com sucesso!");
        } while (continuarTentando && tentativasRealizadas < 3); {
            if(atendeu)
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " APÓS REALIZAR " + tentativasRealizadas + " TENTATIVAS");
            else
                System.out.println("NÃO CONSEGUIMOS REALIZAR O CONTATO COM O " + candidato + " APÓS REALIZAR " + tentativasRealizadas + " TENTATIVAS.");
        }
    }


    //Método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }






    static void imprimirCandidatos(){
        String[] candidatos = {"ANA", "EVA", "HELENA", "JULIA", "LEONARDO"};
        for(int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato(a) de nº " + i + " foi o(a): " + candidatos[i]);
        }

        for(String candidato: candidatos){
            System.out.println("O candidato(a) " + candidato + " foi aprovado no nosso processo seletivo!");
        }

    }

    static void selecaoCandidato(){
        String [] candidatos = {"ANA", "BRUNO", "CARLA", "DANIEL", "EVA", "FERNANDO", "GABRIEL", "HELENA", "IGOR", "JULIA", "KARLA", "LEONARDO", "MARIA", "NATALIA", "OLGA", "PAULO", "QUITERIA", "RAFAEL", "SANDRA", "TIAGO"}; 
        int candidatoAtual = 0;
        int candidatosSelecionados = 0;
        ArrayList<String> nomesSelecionados = new ArrayList<>();
        double salarioOferecido = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            double salarioPretendido = valorPretendido();
            String candidato = candidatos[candidatoAtual];
            System.out.printf("O candidato %s pediu como salario: %.2f%n", candidato, salarioPretendido);
            if(salarioOferecido >= salarioPretendido){
                System.out.println("E garantiu a vaga na empresa :)! ");
                candidatosSelecionados++;
                nomesSelecionados.add(candidato);
            }
            candidatoAtual++;
        }
        System.out.println("Esses foram os selecionados no nosso processo de seleção: " + nomesSelecionados);
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}

    /* static void analisarCandidato(double salarioPretendido){
        double salarioOfertado = 2000.0;

        if(salarioPretendido > salarioOfertado)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if(salarioPretendido == salarioOfertado)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
    }
}
    */
