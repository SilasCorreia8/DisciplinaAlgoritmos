package correia.silas.algoritmos.aula16;

/*
2. Faça uma rotina recursiva para calcular a somatória de todos os número de 1
a N.

1 2 3 4 5 = 1+2+3+4+5

caso base: soma = 1 se n = 1

mat.

f(x) = x+f(x-1)

recursão:

soma(x) = x + soma(x-1)
*/

import javax.swing.*;

public class Exercicio2 {

    public static int soma (int n) {

        //Caso base
        if (n == 1) {
            return 1;
        } else {
            return n + soma(n-1);
        }
    }

    public static void main(String[] args) {

        int n1;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Valor: "));

        JOptionPane.showMessageDialog(null, soma(n1));

    }
}
