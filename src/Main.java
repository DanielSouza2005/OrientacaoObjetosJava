import classes.modelos.Spotify.Musica;
import classes.modelos.Spotify.Podcast;
import classes.modelos.calculos.CalculadoraDeTempo;
import classes.modelos.screenMatch.Filme;
import classes.modelos.utils.ClassificacaoEtaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void ScreenMatch() {
        Filme DeVoltaParaOFuturoFilme = new Filme("De Volta para o Futuro", 1985, true,
                0, 0, 120, "Robert Zemeckis",
                180, 1000000);

        Filme TopGunMaverickFilme = new Filme("Top Gun Maverick", 2022, false,
                0, 0, 131, "Joseph Kosinski",
                180, 1000000);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(DeVoltaParaOFuturoFilme);
        calculadora.inclui(TopGunMaverickFilme);

        System.out.println(DeVoltaParaOFuturoFilme.getNome());
        System.out.println(TopGunMaverickFilme.getNome());
        System.out.println(calculadora.getTempoTotal());
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Musica drownBMTH = new Musica("Drown", 3, 0, 0, ClassificacaoEtaria.DEZ,
                120, "Who will fix me now?", "Rock", "Bring me the Horizon");

        Podcast duolingoIngles = new Podcast("Aprendendo Inglês com Duolingo", 500, 0, 0,
                ClassificacaoEtaria.DEZOITO, "Aprender Inglês", "English or Vanish?", "Duolingo, a Coruja");

        for (int i = 0; i < 1000; i++) {
            drownBMTH.reproduzir();
        }

        for (int i = 0; i < 400; i++) {
            drownBMTH.curtir();
        }

        for (int i = 0; i < 500; i++) {
            duolingoIngles.reproduzir();
        }

        for (int i = 0; i < 200; i++) {
            duolingoIngles.curtir();
        }

    }
}