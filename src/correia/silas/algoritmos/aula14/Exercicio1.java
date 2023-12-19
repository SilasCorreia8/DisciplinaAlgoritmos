package correia.silas.algoritmos.aula14;

/*
1. Crie um algoritmo que lê 5 notas de alunos e calcula a média
*/

import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {

        int nota[] = new int[5];
        double soma = 0, media = 0;

        String num;

        for (int i = 0; i <=4; i++) {

            num = JOptionPane.showInputDialog(null, "Informe as notas:");

            nota[i] = Integer.parseInt(num);

            soma = soma + nota[i];

            media = soma / 5;

        }

        JOptionPane.showMessageDialog(null, "A média do aluno é "+media);

    }
}
