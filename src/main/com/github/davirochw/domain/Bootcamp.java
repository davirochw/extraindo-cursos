package main.com.github.davirochw.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp{

    private String nomeBootcamp;
    private String descricaoBootcamp;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(30);
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Aluno> alunosInscritos = new HashSet<>();

    public String getNomeBootcamp() {
        return nomeBootcamp;
    }

    public void setNomeBootcamp(String nomeBootcamp) {
        this.nomeBootcamp = nomeBootcamp;
    }

    public String getDescricaoBootcamp() {
        return descricaoBootcamp;
    }

    public void setDescricaoBootcamp(String descricaoBootcamp) {
        this.descricaoBootcamp = descricaoBootcamp;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Set<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void setAlunosInscritos(Set<Aluno> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }

}
