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

//No geral, tem-se 3 abordagens para os tests

//1 - Teste num método que devolve um valor, ou seja, chamo um método, pego o retorno e em cima do retorno faço o Assert(Validação)
//Esse é um caso do BonusServiceTest, onde o método é: calcularBonus e o retorno: bonus

//2 - Teste num método que devolve void, o Assert é feito em cima do Objeto que estou passando no método
//Esse é um caso do ReajusteServiceTest, onde o método é: concederReajuste e o Objeto: Funcionario

//3 - Teste de Exception