package br.com.dio.desafio.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    private TipoPlano plano;
    private List<Treino> treinos = new ArrayList<>();

    public Aluno(String nome, String cpf, TipoPlano plano) {
        super(nome, cpf);
        this.plano = plano;
    }

    public void adicionarTreino(Treino treino) {
        if (!treinos.contains(treino)) {
            this.treinos.add(treino);
        }
    }

    public List<Treino> getTreinos() {
        return treinos;
    }

    public TipoPlano getPlano() {
        return plano;
    }

    public void setPlano(TipoPlano plano) {
        this.plano = plano;
    }

    public void setTreinos(List<Treino> treinos) {
        this.treinos = treinos;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", plano=" + plano +
                ", treinos=" + treinos +
                '}';
    }
}
