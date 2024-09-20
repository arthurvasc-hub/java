package edu.arthur.OrdenacaoList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoas;

    

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }



    public void adicionarPessoas(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoaPorAltura, new ComparetorPorAltura());
        return pessoaPorAltura;
    }


}
