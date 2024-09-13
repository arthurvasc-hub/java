package edu.arthur.Construtores;

public class VerificarPessoa {
    public static void main(String[] args) {
        Pessoa arthur = new Pessoa("Arthur", "084.292.283-06");
        
        arthur.setEndereco("General Pipipi 1000");
        System.out.println(arthur.getNome() + " " + arthur.getCpf() + " " + arthur.getEndereco());
    }    
}
