package FacadeMethod;

public class FuncionarioFacade {

    public static boolean verificarFuncionarioReprovado(Funcionario funcionario) {
        if (FichaCriminal.getInstancia().verificarFuncionarioReprovado(funcionario)) {
            return false;
        }
        if (EnsinoMedio.getInstancia().verificarFuncionarioReprovado(funcionario)) {
            return false;
        }
        if (HistoricoMedico.getInstancia().verificarFuncionarioReprovado(funcionario)) {
            return false;
        }
        return true;
    }
}
