package FacadeMethodTest;

import FacadeMethod.EnsinoMedio;
import FacadeMethod.FichaCriminal;
import FacadeMethod.Funcionario;
import FacadeMethod.HistoricoMedico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarFuncionarioReprovadoPorFichaCriminal() {
        Funcionario funcionario = new Funcionario();
        FichaCriminal.getInstancia().addFuncionarioReprovado(funcionario);

        assertEquals(false, funcionario.promocao());
    }

    @Test
    void deveRetornarFuncionarioReprovadoPorEnsinoMedio() {
        Funcionario funcionario = new Funcionario();
        EnsinoMedio.getInstancia().addFuncionarioReprovado(funcionario);

        assertEquals(false, funcionario.promocao());
    }

    @Test
    void deveRetornarFuncionarioReprovadoPorHistoricoMedico() {
        Funcionario funcionario = new Funcionario();
        HistoricoMedico.getInstancia().addFuncionarioReprovado(funcionario);

        assertEquals(false, funcionario.promocao());
    }

    @Test
    void deveRetornarFuncionarioPromovido() {
        Funcionario funcionario = new Funcionario();

        assertEquals(true, funcionario.promocao());
    }

}
