package edu.arthur.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data = LocalDate.now();


    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String toString() {
        return "Curso { " +
                "Titulo = " + super.getTitulo() + "/" +
                " Descricao = " + super.getDescricao() + "/" +
                " Data de inicio = " + data +
                '}';
    }

}

