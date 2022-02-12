package main.com.github.davirochw.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria -" +
                " Título: " + getTitulo() +
                " Descrição: " + getDescricao() +
                " Data: " + data +
                " Carga horária: " + getCargaHoraria() +
                " Quantidade de alunos: " + getQuantidadeAlunos() +
                " Instrutor: " + getInstrutor();
    }
}
