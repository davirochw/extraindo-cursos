package main.com.github.davirochw.domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Aluno extends Pessoa {

    private int matricula;
    private Set<Curso> cursosInscritos = new LinkedHashSet<>();
    private Set<Curso> cursosConcluidos = new LinkedHashSet<>();

    public void inscreverCurso(Curso curso) {
        cursosInscritos.add(curso);
        curso.getAlunosInscritos().add(this);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return " Aluno: " + getNome() +
                " Matricula: " + matricula +
                " Cuso: " + getCurso();
    }
}
