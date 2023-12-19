package correia.silas.algoritmos.aula8;

/*
3. Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo
ou Obtusângulo. Sendo que:
a) Triângulo Retângulo: possui um ângulo reto. (igual a 90°)
b) Triângulo Obtusângulo: possui um ângulo obtuso. (maior que 90°)
c) Triângulo Acutângulo: possui três agudos. (menor que 90°)

Portugol

var
    a1, a2, a3: Inteiro
inicio
    Leia(a1)
    Leia(a2)
    Leia(a3)
    se ((a1 + a2 + a3) == 180) entao {
        se (a1 == 90 ou a2 == 90 ou a3 == 90) entao {
            Escreval("O triãngulo é um Triãngulo Retângulo!")
        }
        senao se (a1 > 90 ou a2 > 90 ou a3 > 90) entao {
            Escreval("O triãngulo é um Triãngulo Obtusângulo!")
        }
        senao {
            Escreval("O triângul é um Triângulo Acutângulo!")
        }
    }
    senao {
        Escreval("Os valores digitados não são de um ângulo de um triângulo!")
        Escreval("Para ser ângulo de um triângulo a soma dos três ângulos tem que dá o resultado 180°!")
    }
Fim
*/

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {

        int a1, a2, a3;

        String stA1, stA2, stA3;

        stA1 = JOptionPane.showInputDialog(null, "Digite o valor do primeiro ângulo:");
        stA2 = JOptionPane.showInputDialog(null, "Digite o valor do segundo ângulo:");
        stA3 = JOptionPane.showInputDialog(null, "Digite o valor do terceiro ângulo:");

        a1 = Integer.parseInt(stA1);
        a2 = Integer.parseInt(stA2);
        a3 = Integer.parseInt(stA3);

        if ((a1 + a2 +a3) == 180) {

            if (a1 == 90 || a2 == 90 || a3 == 90) {
                JOptionPane.showMessageDialog(null, "O triângulo é um Triâmgulo Retângulo!");
            }
            else if (a1 > 90 || a2 > 90 || a3 > 90) {
                JOptionPane.showMessageDialog(null, "O triângulo é um Triâmgulo Obtusângulo!");
            }
            else {
                JOptionPane.showMessageDialog(null, "O triângulo é um Triâmgulo Acutângulo!");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Os valores digitados não são de um ângulo de um triângulo!" +
                    "\nPara ser ângulo de um triângulo a soma dos três ângulos tem que dá o resultado 180°!");
        }

    }
}
