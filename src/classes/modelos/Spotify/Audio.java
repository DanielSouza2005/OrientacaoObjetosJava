package classes.modelos.Spotify;

import classes.modelos.utils.ClassificacaoEtaria;

public class Audio {
    private String nome;
    private int duracao;
    private int totalReproducoes;
    private int curtidas;
    public ClassificacaoEtaria classificacaoEtaria;

    public Audio(String nome,
                 int duracao,
                 int totalReproducoes,
                 int curtidas,
                 ClassificacaoEtaria classificacaoEtaria) {
        this.nome = nome;
        this.duracao = duracao;
        this.totalReproducoes = totalReproducoes;
        this.curtidas = curtidas;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public ClassificacaoEtaria getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(ClassificacaoEtaria classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curtir(){
        this.curtidas++;
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }

}
