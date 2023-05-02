package FacadeMethod;

public class HistoricoMedico extends Contratacao {

    private static HistoricoMedico historicoMedico = new HistoricoMedico();

    private HistoricoMedico() {};


    public static HistoricoMedico getInstancia() {
        return historicoMedico;
    }

    }
