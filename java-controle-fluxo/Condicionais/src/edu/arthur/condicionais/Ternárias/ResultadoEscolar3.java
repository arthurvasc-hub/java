package edu.arthur.condicionais.Ternárias;

public class ResultadoEscolar3 {
    public static void main(String[] args) {
        double nota = 8;
        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
        
}

}
