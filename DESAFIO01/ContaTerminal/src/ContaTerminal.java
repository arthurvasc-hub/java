import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obeter pela classe scanner os valores digitados no terminal
        //Exibir a mensagem conta criada.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // .useLocale(Locale.US); permite que eu use "." para tipos doubles.

        System.out.println("Por favor, digite o seu nome!");
            String nomeCliente = scanner.next();
        System.out.println("Por favor, digite o número da Conta!");
            int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência!");
            String agencia = scanner.next();
        System.out.println("Por favor, digite o seu saldo!");
            double saldo = scanner.nextDouble();
        
        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
