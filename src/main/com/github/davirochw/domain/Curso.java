package main.com.github.davirochw.domain;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Título=" + getTitulo() +
                "; Descrição=" + getDescricao() +
                "; Carga Horária=" + cargaHoraria +
                "}";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
