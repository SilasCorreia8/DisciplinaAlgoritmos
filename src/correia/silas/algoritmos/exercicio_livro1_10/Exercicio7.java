package correia.silas.algoritmos.exercicio_livro1_10;

/*
7. Ler o preço de duas blusas e imprimir qual é o maior. Desconsidere empates.

Portugol:

var
    preco1, preco2: Real
Inicio
    Leia(preco1)
    Leia(preco2)
    se (preco1 > preco2 ) entao {
        Escreval(preco1+" é maior que "preco2)
    }

    senao {
        if (preco2 > preco1) entao {
            Escreval(preco2+" é maior que "preco1)
        }
    }
Fim
*/


import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {

        double preco1, preco2;

        String stPreco1, stPreco2;

        stPreco1 = JOptionPane.showInputDialog(null, "Digite o valor da primeira blusa:");
        stPreco2 = JOptionPane.showInputDialog(null, "Digite o valor da segunda blusa:");

        preco1 = Double.parseDouble(stPreco1);
        preco2 = Double.parseDouble(stPreco2);

        if (preco1 > preco2) {
            JOptionPane.showMessageDialog(null, preco1+" é maior que "+preco2);
        }
        else {
            if (preco2 > preco1) {
                JOptionPane.showMessageDialog(null, preco2 + " é maior que " + preco1);
            }
        }

    }
}
