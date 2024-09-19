package edu.arthur.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinhoCompras;

    public CarrinhoDeCompras(List<Item> carrinhoCompras){
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> removerCompras = new ArrayList<>();
        for(Item i : carrinhoCompras){
            if(i.getNome().equalsIgnoreCase(nome)){
                removerCompras.add(i);
            }
        }
        carrinhoCompras.removeAll(removerCompras);
    }

    public void calcularValorTotal(){
    double precoTotal = 0.0;
        for(Item i : carrinhoCompras){
            precoTotal += i.getPreco() * i.getQuantidade();
        }
        System.out.println("Valor total da compra: R$" + precoTotal);;
    }

    public void exibirItens(){
        for(Item i : carrinhoCompras)
            System.out.println(i.toString());
    }

    public List<Item> getCarrinhoCompras() {
        return carrinhoCompras;
    }
    
}
