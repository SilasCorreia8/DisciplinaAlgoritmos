package correia.silas.algoritmos.Exercicio_livro16_30;

/*
18. A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por hora extra. Faça um algoritmo para
calcular e imprimir o salário bruto e o salário líquido de um determinado funcionário. Considere que o salário
líquido é igual ao salário bruto descontando-se 10% de impostos.
*/

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio18 {
    public static void main(String[] args) {

        double horaT, horaEx, salarioLiquido, salarioBruto;

        horaT = Integer.parseInt(JOptionPane.showInputDialog(null, "Qunatas horas trabalhadas?"));

        horaEx = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas horas extras "+
                "trabalhadas?"));

        DecimalFormat corte = new DecimalFormat("#.##");

        if (horaT >= 0 &&  horaEx >= 0) {

            salarioBruto = (horaT * 10) + (horaEx * 15);

            salarioLiquido = salarioBruto * 0.9;

            JOptionPane.showMessageDialog(null, "Salario Bruto: "+salarioBruto+
                    "\nSalario Líquido: "+corte.format(salarioLiquido));

        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridas informações invalidas.");
        }

    }
}
