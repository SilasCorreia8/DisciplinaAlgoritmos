package correia.silas.algoritmos.aula16;

/*
Crie um algoritmo para multiplicar dois número inteiros usando recursividade.
*/

import javax.swing.*;

public class Recursao {

    public static int multR(int m, int n) {

        if (n > 0) {
            return m + multR(m,n-1);
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {

        int n1, n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor: "));

        JOptionPane.showMessageDialog(null, multR(n1, n2));

    }
}
