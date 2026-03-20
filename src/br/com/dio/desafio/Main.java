package br.com.dio.desafio;

import br.com.dio.desafio.model.*;
import br.com.dio.desafio.service.AcademiaService;

public class Main {
    public static void main(String[] args) {

        AcademiaService service = new AcademiaService();

        Aluno aluno = new Aluno("Dani", "123", TipoPlano.MENSAL);
        service.cadastrarAluno(aluno);

        Instrutor instrutor = new Instrutor("Carlos", "999", Especialidade.MUSCULACAO);

        Treino treino = service.criarTreino("Treino A", "Iniciante");

        service.adicionarTreino(aluno.getCpf(), treino);

        service.alterarPlano("123", TipoPlano.ANUAL);

        System.out.println(service.listarAlunos());

        service.removerAluno("123");

        System.out.println(service.listarAlunos());
    }

}


