package correia.silas.algoritmos.exercicio_livro1_10;

/*
Ler a idade de uma pessoa e exibir uma mensagem dizendo se ela está compreendida entre 18 e 65 anos.

Portugol:

var
    idade:Inteiro
Inicio
    Leira(idade)
    Se (idade >= 18  e idade <= 65) Entao
        Escreval("A idade dessa pessoa está entre 18 e 65 anos!")
    senao
        Escreval("A idade dessa pessoa não está entre 18 e 65 anos!")
Fim
*/

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {

        int idade;

        String stIdade;

        stIdade = JOptionPane.showInputDialog(null, "Informe a idade:");

        idade = Integer.parseInt(stIdade);

        if (idade >= 18 & idade <= 65) {
            JOptionPane.showMessageDialog(null, "A idade dessa pessoa está entre 18 e 65 anos!");
        }
        else {
            if (idade >= 0 & idade <= 120) {
                JOptionPane.showMessageDialog(null, "A idade dessa pessoa não está entre 18 e 65 anos!");
            }
        }

    }
}
