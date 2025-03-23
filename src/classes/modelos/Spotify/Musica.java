package classes.modelos.Spotify;

import classes.modelos.utils.Classificacao;
import classes.modelos.utils.ClassificacaoEtaria;

public class Musica extends Audio implements Classificacao {

    public int BPM;
    public String letra;
    public String genero;
    public String artista;

    public int getBPM() {
        return BPM;
    }

    public void setBPM(int BPM) {
        this.BPM = BPM;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Musica(String nome,
                  int duracao,
                  int totalReproducoes,
                  int curtidas,
                  ClassificacaoEtaria classificacaoEtaria,
                  int BPM,
                  String letra,
                  String genero,
                  String artista) {
        super(nome, duracao, totalReproducoes, curtidas, classificacaoEtaria);
        this.BPM = BPM;
        this.letra = letra;
        this.genero = genero;
        this.artista = artista;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
