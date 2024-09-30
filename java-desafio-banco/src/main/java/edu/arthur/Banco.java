package edu.arthur;
import java.util.ArrayList;
import java.util.List;


public class Banco {
    final String NOME_BANCO = "Banco INTER";
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<Conta>();
    }

    // Métod para registrar uma nova conta
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta registrada.");
        } else {
            contas.stream()
                    .forEach(conta -> {
                        conta.imprimirInfosComuns();
                        System.out.println("-------------");
                    });
        }
    }
}
