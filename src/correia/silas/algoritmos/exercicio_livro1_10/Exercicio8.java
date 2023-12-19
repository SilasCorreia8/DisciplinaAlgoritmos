package correia.silas.algoritmos.exercicio_livro1_10;

/*
8. Ler uma letra e imprimir uma mensagem "É UMA VOGAL" se condizente. Assuma que as letras estão sempre em maiúsculas.

Portugol:

var
    letra: Caractere
Inicio
    Leia(letra)
    se (letra = "A" ou letra = "E" ou letra = "I" ou letra = "O" ou letra = "U") entao {
        Escreval("É UMA VOGAL")
    }
Fim
*/

import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {

        String letra;

        letra = JOptionPane.showInputDialog(null, "Digite a letra:");

        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            JOptionPane.showMessageDialog(null, letra+" é uma vogal!");
        }

    }
}
