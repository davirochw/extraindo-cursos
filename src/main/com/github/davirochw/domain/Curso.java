package main.com.github.davirochw.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Curso extends Conteudo{

    private LocalDate data;
    private String[] alunos;
    private Set<Aluno> alunosInscritos = new HashSet<>();

    public Set<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void setAlunosInscritos(Set<Aluno> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }


    public String[] getAlunos() {
        return alunos;
    }

    public void setAlunos(String[] alunos) {
        this.alunos = alunos;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Curso -" +
                " Título: " + getTitulo() +
                " Descrição: " + getDescricao() +
                " Data: " + data +
                " Carga horária: " + getCargaHoraria() +
                " Quantidade de alunos: " + getQuantidadeAlunos() +
                " Instrutor: " + getInstrutor();
    }
}
