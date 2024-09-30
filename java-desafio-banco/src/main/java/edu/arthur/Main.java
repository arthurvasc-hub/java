package edu.arthur;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente arthur = new Cliente();
        arthur.setNome("Arthur");
        Conta ccArthur = new ContaCorrente(arthur);

        Cliente milene = new Cliente();
        milene.setNome("Milene");
        Conta poupancaMilene = new ContaCorrente(milene);

        banco.adicionarConta(ccArthur);
        banco.adicionarConta(poupancaMilene);

        banco.listarContas();



    }
}
