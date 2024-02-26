import model.DESEMPENHO;
import model.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.ReajusteService;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ReajusteServiceTest {

    private ReajusteService reajusteService;
    private Funcionario funcionario;

    @BeforeEach //Antes de testar cada método, chame esse método abaixo
    public void inicializar(){
        this.reajusteService = new ReajusteService();
        this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
    }

    @Test
    void desempenhoADesejarReajusteDe3PorCento() {
        reajusteService.concederReajuste(funcionario, DESEMPENHO.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    void desempenhoBomReajusteDe15PorCento() {
        reajusteService.concederReajuste(funcionario, DESEMPENHO.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    void desempenhoOtimoReajusteDe20PorCento() {
        reajusteService.concederReajuste(funcionario, DESEMPENHO.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

}
