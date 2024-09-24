package edu.arthur.PesquisaMap;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
   private Map<Long, Produto> estoqueProdutosMap;

public EstoqueProdutos() {
    this.estoqueProdutosMap = new HashMap<>();
}

public void adicionarProduto(long cod, String nome, int quantidade, double preco){
    estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
}

public void exibirProdutos(){
    System.out.println(estoqueProdutosMap);
}

public double calcularValorTotalEstoque(){
    double valorTotal = 0d;
    if(!estoqueProdutosMap.isEmpty()){
        for(Produto p : estoqueProdutosMap.values()){
            valorTotal += p.getPreco() * p.getQuantidade();
        }
    }
    return valorTotal;
}
   
public Produto obterProdutoMiasCaro(){
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    if(!estoqueProdutosMap.isEmpty()){
        for(Produto p : estoqueProdutosMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
        }
    }
    return produtoMaisCaro;
}


public static void main(String[] args) {
    EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
    estoqueProdutos.exibirProdutos();
    estoqueProdutos.adicionarProduto(1L, "Produto A", 1, 15.9);
    estoqueProdutos.adicionarProduto(2L, "Produto B", 2, 5.0);
    estoqueProdutos.adicionarProduto(3L, "Produto C", 2, 1.0);
    estoqueProdutos.adicionarProduto(4L, "Produto D", 3, 6.0);
    estoqueProdutos.adicionarProduto(5L, "Produto E", 1, 20.0);
    estoqueProdutos.exibirProdutos();


   System.out.println("Valor total do estoque é : " + estoqueProdutos.calcularValorTotalEstoque()); 

   System.out.println("O produto mais caro é : " + estoqueProdutos.obterProdutoMiasCaro());
}
}
