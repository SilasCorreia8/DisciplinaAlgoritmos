package correia.silas.algoritmos.aula16;

/*
Crie um algoritmo que some dois valores inteiros.
*/

import javax.swing.*;

public class modularizacao {

    //Metodo Estatico
    public static int soma(int n1, int n2) {

        int somaValores = 0;

        somaValores = n1 + n2;

        return somaValores;
    }

    public static void main(String[] args) {

        int n3, n4;

        n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número: "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número: "));

        JOptionPane.showMessageDialog(null, soma(n3, n4));

    }
}
