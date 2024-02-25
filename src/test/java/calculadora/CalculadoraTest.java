package calculadora;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void SomarDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(3, 7);

        Assert.assertEquals(10, soma); //Testando o resultado esperado
        //Assert.assertEquals(12, soma); Testando um resultado errado
    }
}
