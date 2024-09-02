import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // .useLocale(Locale.US); permite que você use "." para tipos doubles.

            System.out.println("Por favor, digite o seu nome!");
            String nome = scanner.next();

            System.out.println("Por favor, digite o seu sobrenome!");
            String sobrenome = scanner.next();

            System.out.println("Por favor, digite sua idade!");
            int idade = scanner.nextInt();

            System.out.println("Por favor, digite sua altura!");
            double altura = scanner.nextDouble();

            System.out.println("Olá " + nome + " " + sobrenome + ". Você possui " + idade + " anos, e " + altura + " cm de altura.");

            scanner.close();
        } catch (InputMismatchException err) {
            System.err.println("Os campos de idade e altura precisam ser numéricos.\n" +  "Certifique-se também, de que a altura está separada por um '.' ");
        }
    }
}

