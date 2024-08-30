package edu.arthur.estruturas;

public class ForArrays {
public static void main(String[] args) {
    String [] alunos = { "FELIPE", "ARTHUR", "DAMZIK", "JHONNY", "PEDRÃO"};
        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice " + x + " é " + alunos[x]);
        }
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }    


        System.out.println("Acabaram os alunos");

}
}
