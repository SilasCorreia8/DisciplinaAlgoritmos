package correia.silas.algoritmos.aula4;
/*
Crie um algoritmo para verificar o calculo de INSS sobre o salario minino (14%)

var
    salario,salarioReajustado:Real
Inicio
    Leia(salario)
    salarioReajustado <- salario * 1,14
    Escreval(salarioReajustado)
Fim
*/
import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {

        double salario, salarioReajustado;

        String stSalario;

        stSalario = JOptionPane.showInputDialog(null, "Digite o valor do salario:");

        salario = Double.parseDouble(stSalario);

        salarioReajustado = salario * 1.14;

        JOptionPane.showMessageDialog(null, "O salario com um reajuste de 14% é: "+salarioReajustado);

    }
}
