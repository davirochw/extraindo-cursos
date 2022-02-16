package main.com.github.davirochw.domain;

public abstract class Conteudo {

    private String titulo;
    private String descricao;
    private int cargaHoraria;
    private int quantidadeAlunos;

    protected static final double XP_PADRAO = 20d;

    public abstract double calcularXp();

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int qtdAlunos) {
        this.quantidadeAlunos = qtdAlunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
