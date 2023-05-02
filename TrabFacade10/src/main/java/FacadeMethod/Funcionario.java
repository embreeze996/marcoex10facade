package FacadeMethod;

import java.text.Normalizer;

public class Funcionario {

    public boolean promocao() {
        return FuncionarioFacade.verificarFuncionarioReprovado(this);
    }
}