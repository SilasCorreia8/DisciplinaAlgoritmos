package correia.silas.algoritmos.aula16;

/*
5. Criar um algoritmo que retorna a soma dos n primeiros
inteiros pares usando recursão.
soma(n) = 2 se n = 1
recursão: (2 * n) + soma(n −1) se n > 1
*/

import javax.swing.*;

public class Exercicio5 {

    public static int somaPar(int n) {

        //Caso Base
        if (n == 1) {
            return 2;
        } else {
            //Calculo / Caso Geral
            return (2 * n) + somaPar(n -1);
        }

    }

    public static void main(String[] args) {

        int n1;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor: "));

        JOptionPane.showMessageDialog(null, somaPar(n1));

    }
}
