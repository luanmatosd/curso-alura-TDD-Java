package service;

import model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {

    //O funcionário só receberá bônus até de 1k, passou disso, o bônus é zero!
    public BigDecimal calcularBonus(Funcionario funcionario) {
        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
        if (valor.compareTo(new BigDecimal("1000")) > 0) {
            throw new IllegalArgumentException("Salário acima de 10k não pode receber bônus!");
        }
        return valor.setScale(2, RoundingMode.HALF_UP); //Arredonda o número para cima com duas casas decimais
    }
}
