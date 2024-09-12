package edu.arthur.gettersSetters;

public class Aluno {
    private String nome;
    private int idade;

    public String getName(){
        return nome;
    }

    public void setName(String newNome){
        this.nome = newNome;
    }

    public int getAge(){
        return idade;
    }

    public void setAge(int newIdade){
        this.idade = newIdade;
    }
}
