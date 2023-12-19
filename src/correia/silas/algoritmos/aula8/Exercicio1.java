package correia.silas.algoritmos.aula8;

/*
1. Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usuário valores iguais.

Portugol

var
    n1, n2, n3: Inteiro
Inicio
    Leia(n1)
    Leia(n2)
    Leia(n3)
    se (a==b ou a==c ou c==b) entao {
        Escreval("Existem numeros iguais")
    }
    senao se (a > b e a > c) entao {
        Escreval("O valor "+a+" é o maior valor!")
    }
    senao se (b > a e b > c) entao {
        Escreval("O valor "+b+" é o maior valor!")
    }
    senao {
        Escreval("O valor "+c+" é o maior valor!")
    }
Fim
*/

import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {

        int a, b, c;

        String stA, stB, stC;

        stA = JOptionPane.showInputDialog(null, "Digite o primeiro valor:");
        stB = JOptionPane.showInputDialog(null, "Digite o segundo valor:");
        stC = JOptionPane.showInputDialog(null, "Digite o terceiro valor:");

        a = Integer.parseInt(stA);
        b = Integer.parseInt(stB);
        c = Integer.parseInt(stC);

        if (a == b || a == c || b == c) {
            JOptionPane.showMessageDialog(null, "Alguns números são iguais, digite todos diferentes!");
        }
        else if (a > b && a > c) {
            JOptionPane.showMessageDialog(null, "O Primeiro valor: "+a+" é o maior entre eles!");
        }
        else if (b > a && b > c) {
            JOptionPane.showMessageDialog(null, "O Segundo valor: "+b+" é o maior entre eles!");
        }
        else {
            JOptionPane.showMessageDialog(null, "O Terceiro valor: "+c+" é o maior entre eles!");
        }
    }
}
