package correia.silas.algoritmos.aula14;

/*
3. Crie um algoritmo que lê 5 números inteiros e exiba a soma dos pares e a soma dos impares.
*/

import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {

        int numero[] = new int[5];
        int spar = 0, simpar = 0;

        String num;

        for (int i = 0;i <= 4; i ++) {

            num = JOptionPane.showInputDialog(null, "Insira os valores:");

            numero[i] = Integer.parseInt(num);

            if (numero[i] % 2 == 0) {
                spar = spar + numero[i];
            }
            else {
                simpar = simpar + numero[i];
            }

        }

        JOptionPane.showMessageDialog(null, "A soma dos números pares é "+spar+
                "\nA soma dos números impares é "+simpar);

    }
}
