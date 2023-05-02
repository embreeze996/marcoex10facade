package FacadeMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Contratacao {

    private List<Funcionario> funcionariosReprovados = new ArrayList<Funcionario>();

    public void addFuncionarioReprovado(Funcionario funcionario) {
        this.funcionariosReprovados.add(funcionario);
    }

    public boolean verificarFuncionarioReprovado(Funcionario funcionario) {
        return this.funcionariosReprovados.contains(funcionario);
    }

}
