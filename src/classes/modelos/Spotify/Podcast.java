package classes.modelos.Spotify;

import classes.modelos.utils.Classificacao;
import classes.modelos.utils.ClassificacaoEtaria;

public class Podcast extends Audio implements Classificacao {
    private String assunto;
    private String transcricao;
    private String apresentador;

    public Podcast(String nome,
                   int duracao,
                   int totalReproducoes,
                   int curtidas,
                   ClassificacaoEtaria classificacaoEtaria,
                   String assunto,
                   String transcricao,
                   String apresentador) {
        super(nome, duracao, totalReproducoes, curtidas, classificacaoEtaria);
        this.assunto = assunto;
        this.transcricao = transcricao;
        this.apresentador = apresentador;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getTranscricao() {
        return transcricao;
    }

    public void setTranscricao(String transcricao) {
        this.transcricao = transcricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public int getClassificacao() {
        if (this.getCurtidas() > 500) {
            return 10;
        }
        else {
            return 8;
        }
    }
}
