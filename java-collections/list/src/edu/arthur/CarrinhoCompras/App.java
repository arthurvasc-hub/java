package edu.arthur.CarrinhoCompras;

public class App {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(null);
        carrinhoDeCompras.adicionarItem("Chiclete", 1.9, 1);
        carrinhoDeCompras.adicionarItem("Bombom", 5.0, 1);
        carrinhoDeCompras.adicionarItem("Chilito", 1.5, 3);
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.calcularValorTotal();

        carrinhoDeCompras.removerItem("Chiclete");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
    }
}
