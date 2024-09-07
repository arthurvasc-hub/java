import java.util.Scanner;
public class Contador {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        int parametroDois = scanner.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch(ParametrosInvalidosException e) {
            e.printStackTrace();
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
             if(parametroUm > parametroDois)
             throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
             else {
                int contagem = parametroDois - parametroUm;
                //realizar o for para imprimir os números com base na variável contagem
                for(int i = 1; i <= contagem; i++){
                    System.out.println("Imprimindo o numero: " + i);
                }
                
        }
        
        
    }
}
