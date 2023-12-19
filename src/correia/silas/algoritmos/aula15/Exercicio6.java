package correia.silas.algoritmos.aula15;

/*
6. Faça um programa que leia uma matriz 3x3 de inteiros e, depois da leitura, calcule a soma dos elementos de cada
coluna, armazenando o resultado da soma, em um vetor de 3 elementos.
*/

import javax.swing.*;

public class Exercicio6 {
    public static void main(String[] args) {

        int[][] vetor = new int[3][3];
        int[] soma = new int[3];

        String mostrar = "", result = "";

        for (int l = 0; l < 3; l++) {

            mostrar = mostrar + "\n";

            for (int c = 0; c < 3; c++) {

                vetor[l][c] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe os "+
                        "valores:"));

                mostrar = mostrar + vetor[l][c] + " ";

            }

        }

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                soma[l] = soma[l] + vetor[c][l];
            }
        }

        for (int i = 0; i < 3; i++) {
            result = result + "Coluna "+ (i + 1) + " : " + soma[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, "Valores: "+mostrar+
                "\nA soma dos valores por coluna: "+result);

    }
}
