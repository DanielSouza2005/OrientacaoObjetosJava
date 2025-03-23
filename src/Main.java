import classes.modelos.calculos.CalculadoraDeTempo;
import classes.modelos.modulos.Filme;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
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
}