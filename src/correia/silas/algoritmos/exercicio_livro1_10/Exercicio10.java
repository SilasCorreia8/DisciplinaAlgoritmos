package correia.silas.algoritmos.exercicio_livro1_10;

/*
10. Ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar em uma eleição
para prefeito (não é necessário considerar mês em que ela nasceu). Considere o ano atual como 2004.

Portugol:

var
    nasc, res: Inteiro
Inicio
    Leia(nasc)
    se (nasc <= 2004 e nasc >= 1884) entao {
        res = nasc - 2004

        se (res => 16) {
            Escreval("Você está apto para votar!")
            Escreval("Sua idade atual com base no ano de '2004' e o ano que você nasceu é:"+res")
        }
        senao {
            Escreval("Você ainda não está apto para votar!")
            Escreval("Sua idade atual com base no ano de '2004' e o ano que você nasceu é:"+res")
        }
    }
    senao {
        Escreval("Informação Invalida!")
    }

Fim
*/

import javax.swing.JOptionPane;


public class Exercicio10 {
    public static void main(String[] args) {

        int nasc, res;

        String stNasc;

        stNasc = JOptionPane.showInputDialog(null, "Digite o ano em que você nasceu:");

        nasc = Integer.parseInt(stNasc);

        if (nasc <= 2004 && nasc >= 1884) {
            res = 2004 - nasc;

            if (res >= 16) {
                JOptionPane.showMessageDialog(null, "Você está apto para votar!\nSua idade atual com base no ano de '2004' e o ano que você nasceu é:"+res);
            }
            else {
                JOptionPane.showMessageDialog(null, "Você ainda não está apto para voltar!\nSua idade atual com base no ano de '2004' e o ano que você nasceu é:"+res);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Informação Invalida!");
        }

    }
}
