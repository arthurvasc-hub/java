public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("60455385");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde com as regras de negócios");
        }
        
    }   

    static String formatarCep(String cep) throws CepInvalidoException {
            if(cep.length() != 8)
            throw new CepInvalidoException();
            return "60-455-535";
    }
}
