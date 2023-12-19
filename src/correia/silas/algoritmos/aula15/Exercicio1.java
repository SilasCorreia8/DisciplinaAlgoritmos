package correia.silas.algoritmos.aula15;

/*
1. Faça um programa que leia 10 valores reais e os apresente na ordem inversa entrada.
*/

import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {

        //Sem utilizar String / Utilizando dois vetores (Unidimensional)

        double[] v1 = new double[10];
        double[] v2 = new double[10];

        int cont = 0;

        //Prencher o primeiro vetor
        for (int i = 0; i < 10; i++) {
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o "+(i + 1)+
                    "° valor: "));
        }

        //Inverter a ordem dos valores
        for (int j = 9; j >= 0; j--) {
            v2[cont] = v1[j];
            cont++;
        }

        //Mostrar o resultado
        for (int r = 0; r < 10; r++) {
            JOptionPane.showMessageDialog(null, "Resultado: "+v2[r]);
        }

        /*

        Utilizando String e um vetor (Unidimensional)

        double[] v1 = new double[10];

        String resultado = "";

        //Prencher o primeiro vetor
        for (int i = 0; i < 10; i++) {
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o "+(i + 1)+
            "° valor: "));
        }

        //Quardar valores em uma String invertendo a ordem deles
        for (int j = 9; j >= 0; j--) {

            resultado = resultado + v1[j] + "\n";

        }

        //Mostrar Resultado
        JOptionPane.showMessageDialog(null, "Resultado: "+resultado);

        */

    }
}
