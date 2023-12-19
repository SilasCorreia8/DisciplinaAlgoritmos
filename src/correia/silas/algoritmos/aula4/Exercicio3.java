package correia.silas.algoritmos.aula4;

/*
Crie um algoritmo que calcule um acrescimo do salario família sobre um salario minimo que equivale a 5%

var
    salario,salarioF:Real
Inicio
    Leia(salario)
    salarioF <- salario * 1.05
    Escreval(salarioF)
Fim
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio3 {
    public static void main(String[] args) {

        double  salario, salarioF;

        String stSalario;

        stSalario = JOptionPane.showInputDialog(null, "Informe o salario: ");

        salario = Double.parseDouble(stSalario);

        DecimalFormat corte = new DecimalFormat("0.00");

        salarioF = salario * 1.05;

        JOptionPane.showMessageDialog(null, "O salario de "+salario+" com unm acrescimo de 5% é: "+corte.format(salarioF));

    }
}
