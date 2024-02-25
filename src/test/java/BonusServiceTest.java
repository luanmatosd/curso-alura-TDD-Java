import model.Funcionario;
import org.junit.jupiter.api.Test;
import service.BonusService;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class BonusServiceTest {

    //Funcionário com salário acima de 10k, deve ser lançada uma Exception
    @Test
    void bonusDeveSerZeroParaSalarioMuitoAlto() {
        BonusService bonusService = new BonusService();

        //Duas formas de capturar a Exception:
        //assertThrows(IllegalArgumentException.class, () -> bonusService.calcularBonus(new Funcionario("Jorge", LocalDate.now(), new BigDecimal("25000"))));
        try {
            bonusService.calcularBonus(new Funcionario("Jorge", LocalDate.now(), new BigDecimal("25000")));
            fail("Não deu a exception");
        }catch (Exception e){
            assertEquals("Salário acima de 10k não pode receber bônus!", e.getMessage());
        }
    }

    //Funcionário com salário abaixo de 10k, deve ter bônus igual a 10%
    @Test
    void bonusDeveSer10PorCentoDoSalario() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Jussara", LocalDate.now(), new BigDecimal("5000")));

        assertEquals(new BigDecimal("500.00"), bonus); //Verificando se o bônus é igual a 10% de 5000 = 500.00
    }

    //Funcionário com salário de 10k, deve ter bônus igual a 10%
    @Test
    void bonusDeveSer10PorCentoDoSalarioDe1000() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Joice", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus); //Verificando se o bônus é igual a 10% de 10000 = 1000.00
    }
}
