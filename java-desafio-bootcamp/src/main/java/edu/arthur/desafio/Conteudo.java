package edu.arthur.desafio;

public abstract class Conteudo {
    protected final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;


    public abstract double calcularXp();


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}
