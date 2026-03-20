package br.com.dio.desafio.model;

public class Treino {
    private String descricao;
    private String nivel;

    public Treino(String descricao, String nivel) {
        this.descricao = descricao;
        this.nivel = nivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Treino{ " +
                "descricao= '" + descricao + '\'' +
                ", nivel= '" + nivel + '\'' +
                '}';
    }
}
