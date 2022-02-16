package main.com.github.davirochw;

import main.com.github.davirochw.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setCargaHoraria(10);
        curso1.setDescricao("Java é uma linguagem de programação");

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setCargaHoraria(8);
        curso2.setDescricao("Python é uma linguagem de programação");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria Java para você aprender Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Python");
        mentoria2.setDescricao("Mentoria Python para você aprender Python");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNomeBootcamp("Bootcamp Java");
        bootcamp1.setDescricaoBootcamp("Bootcamp Java para você aprender Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria1);
        bootcamp1.getConteudos().add(curso2);

        Aluno aluno1 = new Aluno("Davi", "1231-1231", "email@example.com", "14/12/1990");
        aluno1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos: " + aluno1.getConteudosInscritos());
        aluno1.progredir();
        aluno1.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos: " + aluno1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + aluno1.getConteudosConcluidos());
        System.out.println("XP: " + aluno1.calcularTotalXp());
    }
}
