package FacadeMethod;

public class EnsinoMedio extends Contratacao {

    private static EnsinoMedio ensinoMedio = new EnsinoMedio();

    private EnsinoMedio() {};

    public static EnsinoMedio getInstancia() {
        return ensinoMedio;
    }
}
