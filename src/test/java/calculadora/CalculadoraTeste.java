package calculadora;

//Isso é um teste automatizado, porém, de forma manual, trabalhosa, demorada e utilizando o "main"!
//O ideal é utilizar uma biblioteca paea simplificar esse processo
public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(3, 7);
        System.out.println(soma);

        soma = calculadora.somar(3, 0);
        System.out.println(soma);

        soma = calculadora.somar(3, -7);
        System.out.println(soma);

        soma = calculadora.somar(0, 0);
        System.out.println(soma);
    }
}
