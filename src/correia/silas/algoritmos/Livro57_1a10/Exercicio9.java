package correia.silas.algoritmos.Livro57_1a10;

import javax.swing.*;

/*
9. Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida respectivamente por 10,
12 e 15 reais. Construa um algoritmo em que o usuário forneça a quantidade de camisetas pequenas, média e grandes
referentes a uma venda, e a máquina informe quanto será o valor arrecadado.
*/
public class Exercicio9 {
    public static void main(String[] args) {

        int p, m, g, valorTotal;

        //Entrada de Dados
        p = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de camisas pequenas: "));
        m = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de camisas médias: "));
        g = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de camisas grandes: "));

        if (p >= 0 && m >= 0 && g >= 0) {

            //Calculo
            valorTotal = (p * 10) + (m * 12) + (g * 15);

            //Apresentar Resultado
            JOptionPane.showMessageDialog(null, "Foram comprados:"+
                    "\n"+p+" camisa(s) pequena(s)."+
                    "\n"+m+" camisa(s) média(s)."+
                    "\n"+g+" camisa(s) grande(s)."+
                    "\nE o valor arrecadado foi de R$"+valorTotal+",00.");

        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridos valores inválidos.");
        }

    }
}
