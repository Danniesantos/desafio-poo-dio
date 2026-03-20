package br.com.dio.desafio.model;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa {

    private Especialidade especialidade;
    private List<Aluno> alunos = new ArrayList<>();

    public Instrutor(String nome, String cpf, Especialidade especialidade) {
        super(nome, cpf);
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Instrutor{" +
                "nome=' " + getNome() + '\'' +
                ",cpf=' " + getCpf() + '\'' +
                ",especialidade='" + especialidade + '\'' +
                ", alunos=" + alunos +
                '}';
    }

}
