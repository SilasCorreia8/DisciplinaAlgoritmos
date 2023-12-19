package correia.silas.algoritmos.aula8;

/*
2. Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equílatero, Isósceles ou
Escaleno. Sendo que:
a) Triângulo Equílatero: possui os 3 lados iguais.
b) Triângulo Isósceles: possui 2 lados iguais.
c) Triângulo Escaleno: possui os 3 lados diferentes.

Portugol

var
    l1, l2, l3: Inteiro
Inicio
    Leia(l1)
    Leia(l2)
    Leia(l3)
    se (l1 == l2 e l2 == l3) entao {
        Escreval("Este triângulo é Equílatero!")
    }
    senao se (((l1 == l2) e (l2 != l3)) ou ((l1 != l2) e (l2 == 3))) {
        Escreval("Este triângulo é Isóscelis")
    }
    senao {
        Escreval("Este trinagulo é Escaleno")
    }
Fim
*/

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {

        int l1, l2, l3;

        String stL1, stL2, stL3;

        stL1 = JOptionPane.showInputDialog(null, "Digite o lado um:");
        stL2 = JOptionPane.showInputDialog(null, "Digite o lado dois:");
        stL3 = JOptionPane.showInputDialog(null, "Digite o lado três:");

        l1 = Integer.parseInt(stL1);
        l2 = Integer.parseInt(stL2);
        l3 = Integer.parseInt(stL3);

        if (l1 == l2 && l2 == l3) {
            JOptionPane.showMessageDialog(null, "Este triângulo é Equílatero!");
        }
        else if (((l1 == l2) && (l2 != l3)) || ((l1 != l2) && (l2 == l3))) {
            JOptionPane.showMessageDialog(null, "Este triângulo é Isóscelis!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Este Triângulo é Escaleno");
        }

    }
}
