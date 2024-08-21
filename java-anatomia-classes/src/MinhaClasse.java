public class MinhaClasse {
    
public static void main(String[] args) {
    String primeiroNome = "Arthur";
    String segundoNome = "Vasconcelos";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
}

public static String nomeCompleto(String primeiroNome, String segundoNomeString) {
    return primeiroNome.concat(" ").concat(segundoNomeString);
}

}

