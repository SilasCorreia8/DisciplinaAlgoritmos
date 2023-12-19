package correia.silas.algoritmos.exercicio_livro1_10;

/*
3. Ler um número inteiro e exibir a mensagem "O NÚMERO É MÚLTIPLO DE 7" ou "O NÚMERO NÃO É MÚLTIPLO DE 7".

Portugol:

var
    n1
Inicio
    Leia(n1)
    se (n1 % 7 == 0) entao {
        Escrevaç("O número "+n1+" é múltiplo de 7!")
    }
    senao {
        Escreval("O número "+n1+" não é múltiplo de 7!")
    }
Fim
*/

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {

        int n1;

        String stN1;

        stN1 = JOptionPane.showInputDialog(null, "Digite o valor:");

        n1 = Integer.parseInt(stN1);

        if (n1 % 7 == 0) {
            JOptionPane.showMessageDialog(null, "O número "+n1+" é múltiplo de 7!");
        }
        else {
            JOptionPane.showMessageDialog(null, "O número "+n1+" não é múltiplo de 7!");
        }

    }
}
