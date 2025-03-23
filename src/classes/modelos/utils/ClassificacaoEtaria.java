package classes.modelos.utils;

public enum ClassificacaoEtaria {
    LIVRE(0),
    DEZ(10),
    DOZE(12),
    QUATORZE(14),
    DEZESSEIS(16),
    DEZOITO(18);

    private final int idade;

    ClassificacaoEtaria(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
