package correia.silas.algoritmos.aula6;

/*
var
    n1:inteiro
Inicio
    leia(n1)
    Se (n1 >= 0) Entao
        se (n1 % 2 = 0) entao
            Escreval("O valor é positivo e par!")
        senao
            Escreval("O valor é negativo e impar!")
    senao
        Se (n1 % 2 = 0) Entao
            Escreval("O valor é negatico e par!")
        senao
            Escreval("O valor é negatico e impar"")
Fim
*/

import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {

        int n1;

        String stN1;

        stN1 = JOptionPane.showInputDialog(null, "Digite o valor:");

        n1 = Integer.parseInt(stN1);

        if (n1 >= 0 ) {
            if (n1 % 2 == 0) {
                JOptionPane.showMessageDialog(null, "O valor "+n1+" é positivo e par!");
            }
            else {
                JOptionPane.showMessageDialog(null, "O valor "+n1+" é positivo e impar!");
            }
        }
        else {
            if (n1 % 2 == 0) {
                JOptionPane.showMessageDialog(null, "O valor "+n1+" é negativo e par!");
            }
            else {
                JOptionPane.showMessageDialog(null, "O valor "+n1+" é negativo e impar!");
            }
        }

    }
}
