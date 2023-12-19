package correia.silas.algoritmos.exercicio_livro1_10;

/*
Imprimir se um número X é divisível por um número Y.

Portugol:

var
    n1, n2: Inteiro
Inicio
    Leia(n1)
    Leia(n2)
    se (n1 % n2 == 0) entao {
        Escreval("O valor "+n1+" é divisível por "+n2)
    }
    senao {
        Escreval("O valor "+n1+" não é divisível por "+n2)
    }
Fim
*/

import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {

        int n1, n2;

        String stN1, stN2;

        stN1 = JOptionPane.showInputDialog(null, "Digite o valor X:");
        stN2 = JOptionPane.showInputDialog(null, "Digite o valor Y:");

        n1 = Integer.parseInt(stN1);
        n2 = Integer.parseInt(stN2);

        if (n1 % n2 == 0) {
            JOptionPane.showMessageDialog(null, "O Valor X:"+n1+" é divisível pelo valor Y:"+n2);
        }
        else {
            JOptionPane.showMessageDialog(null, "O Valor X:"+n1+" não é divisível pelo valor Y:"+n2);
        }

    }
}
