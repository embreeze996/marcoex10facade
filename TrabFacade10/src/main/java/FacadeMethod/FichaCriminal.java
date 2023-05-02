package FacadeMethod;

import java.util.ArrayList;

public class FichaCriminal extends Contratacao {

    private static FichaCriminal fichaCriminal = new FichaCriminal();

    private FichaCriminal() {};

    public static FichaCriminal getInstancia() {
        return fichaCriminal;
    }
}