package correia.silas.algoritmos.aula16;

/*
1. Implemente uma função recursiva que, dados dois números inteiros x e n, calcula o valor de xn.

Caso base: X = 1 ⁰

3⁵= 3 x 3⁴
3⁴ = 3 x 3³
…
3 = 1 ⁰

matemática

f(x,y) = x*x y-1

computação

exp(x,y) = x * exp(x,y-1)
*/

import javax.swing.*;

public class Exercicio1 {

    public static int expR (int x, int y) {

        //Calculo
        if (y > 0) {
            return x * expR(x, y -1);
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {

        int n1, n2;

        //Captura dos valores
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor: "));

        //Mostrar resultado final
        JOptionPane.showMessageDialog(null, expR(n1, n2));

    }
}
