package br.com.dio.desafio.service;

import br.com.dio.desafio.model.Aluno;
import br.com.dio.desafio.model.Instrutor;
import br.com.dio.desafio.model.TipoPlano;
import br.com.dio.desafio.model.Treino;

import java.util.ArrayList;
import java.util.List;

public class AcademiaService {

    private List<Aluno> alunos = new ArrayList<>();
    private List<Instrutor> instrutor = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno) {
        if (buscarAlunoPorCpf(aluno.getCpf()) == null) {
            alunos.add(aluno);
            System.out.println("Aluno cadastrado com sucesso!");
        } else {
            System.out.println("Aluno já existe!");
        }
    }

    public List<Aluno> listarAlunos() {
        return alunos;
    }

    public Aluno buscarAlunoPorCpf(String cpf) {
        for (Aluno aluno : alunos) {
            if (aluno.getCpf().equals(cpf)) {
                return aluno;
            }
        }
        return null;
    }
    public void removerAluno(String cpf) {
        Aluno aluno = buscarAlunoPorCpf(cpf);

        if (aluno != null) {
            alunos.remove(aluno);
            System.out.println("Aluno removido!");
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }

    public void adicionarTreino(String cpf, Treino treino) {
        Aluno aluno = buscarAlunoPorCpf(cpf);

        if (aluno != null) {
            aluno.adicionarTreino(treino);
            System.out.println("Treino adicionado!");
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }

    public void alterarPlano(String cpf, TipoPlano novoPlano) {
        Aluno aluno = buscarAlunoPorCpf(cpf);

        if (aluno != null) {
            aluno.setPlano(novoPlano);
            System.out.println("Plano atualizado!");
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }

    public Treino criarTreino(String descricao, String nivel) {
        return new Treino(descricao, nivel);
    }


}
