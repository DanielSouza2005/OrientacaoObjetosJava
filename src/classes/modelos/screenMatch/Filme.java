package classes.modelos.screenMatch;

import classes.modelos.utils.Classificacao;

public class Filme extends Titulo implements Classificacao {

    private String diretor;
    private int duracao;
    private float orcamento;

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public float getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Filme(String nome,
                 int anoDeLancamento,
                 boolean incluidoNoPlano,
                 double somaDasAvaliacoes,
                 int totalDeAvaliacoes,
                 int duracaoEmMinutos,
                 String diretor,
                 int duracao,
                 float orcamento) {
        super(nome, anoDeLancamento, incluidoNoPlano, somaDasAvaliacoes, totalDeAvaliacoes, duracaoEmMinutos);
        this.diretor = diretor;
        this.duracao = duracao;
        this.orcamento = orcamento;
    }

    @Override
    public int getClassificacao() {
        return (int) calculaMedia() / 2;
    }
}
