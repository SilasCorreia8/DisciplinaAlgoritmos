package correia.silas.algoritmos.aula15;

/*
4. Faça um programa que leia uma matriz 4x5 de inteiros e calcule a soma de todos os seus elementos positivos.
*/

import javax.swing.*;

public class Exercicio4 {
    public static void main(String[] args) {

        int[][] vetor = new int[4][5];
        int soma = 0;

        String mostrar = "";

        for (int l = 0; l < 4; l++) {

            mostrar = mostrar + "\n";

            for (int c = 0; c < 5; c++) {

                vetor[l][c] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe os "+
                        "valores"));

                mostrar = mostrar + vetor[l][c] + " ";

                if (vetor[l][c] > 0) {

                    soma = soma + vetor[l][c];

                }
            }

        }

        JOptionPane.showMessageDialog(null, "Valores: "+mostrar+
                "\nA soma dos valores: "+soma);

    }
}
