package correia.silas.algoritmos.aula8;

/*
4. Um quiosque de sorvetes vende somente os sabores: chocolate (R$4,00 por bola de sorvete) e morango (R$3,00 por bola
de sorvete). Faça um algoritmo que dê um desconto, da sequinte forma:
a) Sorvete de chocolate com 3 bolas ou menos de sorvete desconto, desconto de 5%.
b) Caso contrário, desconto de 10%.
c) Sorvete de morango com 3 bolas ou menos de sorvete, desconto de 7%.
d) Caso contrario, desconto de 15%

Portugol

var
    sorvete: Caractere
    bola: Inteiro
    valor: Real
Inicio
    Escreval("Sabores de sorvete disponível:Chocolate e Morango.")
    Escreval("Qual sabor de sorvete você deseja?")
    Leia(sorvete)
    Escreval("Quantas bolas?")
    Leia(bola)
    se (sorvete = "chocolate") entao {
        se (bola > 0 e bola <= 3) entao {
           valor = (4 * bola) - (4 * boola * 0.05)
           Escreval(bola+" bola(s) de sorvete de chocolate com um desconto de 5% é R$"+valor)
        }
        senao se (bola > 3) entao {
            valor = (4 * bola) - (4 * bola * 0.1)
            Escreval(bola+" bola(s) de sorvete de chocolate com um desconto de 10% é R$"+valor)
        }
    }
    senao se (sorvete = "morango") entao {
        se (bola > 0 e bola <= 3) entao {
            valor = (3 * bola) - (3 * bola * 0.07)
            Escreval(bola+" bola(s) de sorvete de morango com um desconto de 7% é R$"+valor)
        }
        senao se (bola > 3) entao {
            valor = (3 * bola) - (3 * bola * 0.15)
            Escreval(bola+" bola(s) de sorvete de morango com um desconto de 15% é R$"+valor)
        }
    } senao {
        Escreval("Informação Invalida")
    }
*/

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {

        int bola;
        double valor;

        String sorvete, stBola;

        sorvete = JOptionPane.showInputDialog(null, "Sabores disponíveis: Chocolate e Morango. \nInforme o sabor do sorvete que você deseja:");
        stBola = JOptionPane.showInputDialog(null, "Informe a quantidade de bolas que você deseja:");

        bola = Integer.parseInt(stBola);

        if (sorvete.equalsIgnoreCase("Chocolate")) {
            if (bola > 0 && bola <= 3) {
                valor = (4 * bola) - (4 * bola * 0.05);
                JOptionPane.showMessageDialog(null, bola+" bola(s) de sorvete de chocolate com um desconto de 5% é R$"+valor);
            } else if (bola > 3) {
                valor = (4 * bola) - (4 * bola * 0.1);
                JOptionPane.showMessageDialog(null, bola+" bola(s) de sorvete de chocolate com um desconto de 10% é R$"+valor);
            }
        } else if (sorvete.equalsIgnoreCase("Morango")) {
            if (bola > 0 && bola <= 3) {
                valor = (3 * bola) - (3 * bola * 0.07);
                JOptionPane.showMessageDialog(null, bola+" bola(s) de sorvete de morango com um desconto de 7% è R$"+valor);
            } else if (bola > 3) {
                valor = (3 * bola) - (3 * bola * 0.15);
                JOptionPane.showMessageDialog(null, bola+" bola(s) de sorvete de morango com um desconto de 15% é R$"+valor);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Informação Invalida");
        }

    }
}
