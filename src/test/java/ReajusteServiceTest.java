import model.DESEMPENHO;
import model.Funcionario;
import org.junit.jupiter.api.Test;
import service.ReajusteService;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ReajusteServiceTest {

    @Test
    void desempenhoADesejarReajusteDe3PorCento() {
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
        reajusteService.concederReajuste(funcionario, DESEMPENHO.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    void desempenhoBomReajusteDe15PorCento() {
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Paula", LocalDate.now(), new BigDecimal("1000"));
        reajusteService.concederReajuste(funcionario, DESEMPENHO.BOM);

        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    void desempenhoOtimoReajusteDe20PorCento() {
        ReajusteService reajusteService = new ReajusteService();
        Funcionario funcionario = new Funcionario("Silvano", LocalDate.now(), new BigDecimal("1000"));
        reajusteService.concederReajuste(funcionario, DESEMPENHO.OTIMO);

        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

}
