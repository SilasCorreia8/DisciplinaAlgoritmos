package correia.silas.algoritmos.aula14;

import javax.swing.*;

/*
Soma de três números utilizando vetor
*/
public class Vetor {
    public static void main(String[] args) {

        int nota[] = new int[3];
        int soma = 0;

        String num;

        for (int i = 0; i <= 2; i++) {
            num = JOptionPane.showInputDialog(null, "Informe o valor:");

            nota[i] = Integer.parseInt(num);

            soma = soma + nota[i];
        }

        JOptionPane.showMessageDialog(null, "O valor da soma é "+soma);

    }
}
