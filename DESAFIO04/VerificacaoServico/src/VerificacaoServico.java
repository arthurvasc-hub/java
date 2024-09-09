import java.util.Scanner;

public class VerificacaoServico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        System.out.println("Digite aqui o serviço a ser verificado: ");
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        System.out.println("Digite aqui o nome do cliente e o serviços contratados: ");
        String entradaCliente = scanner.nextLine().trim();

        // Verifica diretamente se o serviço está nos dados fornecidos pelo cliente
        if (entradaCliente.contains(servico)) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
    }
}

