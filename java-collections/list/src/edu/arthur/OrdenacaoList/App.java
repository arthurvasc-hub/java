package edu.arthur.OrdenacaoList;

public class App {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoLista =  new OrdenacaoPessoas();

        ordenacaoLista.adicionarPessoas("NOME 1", 10, 1.55);
        ordenacaoLista.adicionarPessoas("NOME 2", 17, 1.60);
        ordenacaoLista.adicionarPessoas("NOME 3", 19, 1.45);
        ordenacaoLista.adicionarPessoas("NOME 4", 21, 1.98);
        ordenacaoLista.adicionarPessoas("NOME 5", 25, 2.02);
        ordenacaoLista.adicionarPessoas("NOME 6", 13, 1.54);

        System.out.println(ordenacaoLista.ordenarPorAltura());
        System.out.println(ordenacaoLista.ordenarPorIdade());

       
    }
}
