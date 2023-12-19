package correia.silas.algoritmos.aula15;

/*
5. Faça um programa que leia uma matriz 2x2 de inteiros e o seu determinado D = (a11 * a22) - (a12 * a21).
*/

import javax.swing.*;

public class Exercicio5 {
    public static void main(String[] args) {

        int[][] vetor = new int[2][2];
        int calculo = 0;

        String mostrar = "";

        for (int l = 0; l < 2; l++) {

            mostrar = mostrar + "\n";

            for (int c = 0; c < 2; c++) {

                vetor[l][c] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe os "+
                        "valores"));

                mostrar = mostrar + vetor[l][c] + " ";

            }

        }

        calculo = (vetor[0][0] * vetor[1][1]) - (vetor[0][1] * vetor[1][0]);

        JOptionPane.showMessageDialog(null, "Valores: "+mostrar+
                "\nResultado do calculo com a formula (a11 * a22) - (a12 * a21): "+calculo);

    }
}
