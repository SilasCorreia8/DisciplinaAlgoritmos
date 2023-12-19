package correia.silas.algoritmos.aula15;

/*
2. Faça um programa que receba 3 vetores de 6 posições de números reias sendo o primeiro referente aos 6 primeiros meses
de 2020 e o segundo aoa 6 primeiros meses de 2021 ambos referentes aos gastos de energia elétrica de um domicílio.
Mostre em outro vetor a soma dos gastos de cada mês. Sendo que o índice 0 indica o mês de janeiro .
*/

import javax.swing.*;

public class Exercicio2 {
    public static void main(String[] args) {

        double[] gastos2020 = new double[6];
        double[] gastos2021 = new double[6];
        double[] gastos = new double[6];

        for (int i = 0; i < 6; i++) {

            gastos2020[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe os "+
                    "gastos de energia do "+(i+1)+"° mês de 2020:"));

            gastos2021[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe os "+
                    "gastos de energia do "+(i+1)+"° mês de 2021:"));

            gastos[i] = gastos2020[i] + gastos2021[i];

        }

        String soma = "Soma dos gastos de energia por mês: \n";

        for (int i = 0; i < 6; i++) {
            soma += "mês" + (i+1) + ": " + gastos[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, soma);

    }
}
