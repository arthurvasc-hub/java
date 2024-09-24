package edu.arthur.sets.OrdenacaoSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;


public class CadastroProdutos {
    private Set<Produto> setCadastroProdutos;

    public CadastroProdutos() {
        this.setCadastroProdutos = new HashSet<>();
    }

public void adicionarProduto(long cod, String nome, double preco, int quantidade){
    setCadastroProdutos.add(new Produto(nome, cod, preco, quantidade));
}

public Set<Produto> exibirProdutosPorNome(){
    Set<Produto> produtosPorNome = new TreeSet<>(setCadastroProdutos);
    return produtosPorNome;
}

public Set<Produto> exibirProdutosPorPreco(){
    Set<Produto> produtosPorPreco = new TreeSet<>(new CompararPorPreco());
    produtosPorPreco.addAll(setCadastroProdutos);
    return produtosPorPreco;
}

public static void main(String[] args) {
    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    cadastroProdutos.adicionarProduto(111, "Macarrão", 10.99, 2);
    cadastroProdutos.adicionarProduto(123, "Arroz", 9.99, 3);
    cadastroProdutos.adicionarProduto(145, "Feijão", 5.99, 1);
    cadastroProdutos.adicionarProduto(166, "Pia", 100.99,1);
    cadastroProdutos.adicionarProduto(1444, "Maça", 1.99, 15);

    // System.out.println(cadastroProdutos.exibirProdutosPorNome());
    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
}
    
}
