package correia.silas.algoritmos.aula16;

/*
4. Criar um algoritmo que retorna a soma dos n primeiros
inteiros ímpares usando recursão.
soma(n) = 1 se n = 1
recursão: (2 * n −1) + soma(n −1) se n > 1
*/

import javax.swing.*;

public class Exercicio4 {

    public static int somaImpar(int n) {

        //Caso Base
        if (n == 1) {
            return 1;
        }
        else {
            return (2*n-1) + somaImpar(n-1);
        }

    }

    public static void main(String[] args) {

        int n1;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor: "));

        JOptionPane.showMessageDialog(null, somaImpar(n1));
    }
}
