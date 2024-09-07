import java.util.Scanner;
import java.util.Locale;

public class Candidatura {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo!");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite aqui sua pretensão salarial: ");
        double salarioPretendido = scanner.nextDouble();

        
        analisarCandidato(salarioPretendido);

        scanner.close();

    }
    static void analisarCandidato(double salarioPretendido){
        double salarioOfertado = 2000.0;

        if(salarioPretendido > salarioOfertado)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if(salarioPretendido == salarioOfertado)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
    }
}
