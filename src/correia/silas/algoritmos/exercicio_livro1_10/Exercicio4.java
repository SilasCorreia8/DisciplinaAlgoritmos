package correia.silas.algoritmos.exercicio_livro1_10;

/*
4. Ler um núemro inteiro e imprimir se ele é par e divisível por 3.

Portugol:

var
    n1: Inteiro
Inicio
    Leia(n1)
    se (n1 % 2 == 0 e n1 % 3 == 0) entao {
        Escreval("O número "+n1+" é par e divisível por 3!")
    }
    senao se (n1 % 2 == 0) entao {
        Escreval("O número "+n1+" é par! Mas não é divisível por 3!")
    }
    senao se (n1 % 3 == 0) entao {
        Escreval("O número "+n1+" não é par! Mas é divisível por 3!")
    }
    senao {
        Escreval("O número "+n1+" não é par e também não é divisível por 3!")
    }
Fim
*/

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {

        int n1;

        String stN1;

        stN1 = JOptionPane.showInputDialog(null, "Digite o valor:");

        n1 = Integer.parseInt(stN1);

        if (n1 % 2 == 0 && n1 % 3 == 0) {
            JOptionPane.showMessageDialog(null, "O número "+n1+" é par e divisível por 3!");
        }
        else if (n1 % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número "+n1+" é par! Mas não é divisível por 3!");
        }
        else if (n1 % 3 == 0) {
            JOptionPane.showMessageDialog(null, "O número "+n1+" não é par! Mas é divisível por 3!");
        }
        else {
            JOptionPane.showMessageDialog(null, "O número "+n1+" não é par e também não é divisível por 3!");
        }
    }
}
