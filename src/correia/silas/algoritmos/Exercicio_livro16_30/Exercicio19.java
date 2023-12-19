package correia.silas.algoritmos.Exercicio_livro16_30;

/*
19. A granja Frangotech possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel
com um chip de indentificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir.
Sabendo que o anel com o chip custa R$4,00 e o anel de alimento custa R$3,50, faça um algoritmo para calcular o gasto
total da granja para marcar todos os seus frangos.
*/

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio19 {
    public static void main(String[] args) {

        int nFrango;
        double gastoTotal;

        nFrango = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de Frango: "));

        DecimalFormat corte = new DecimalFormat("#.00");

        if (nFrango >= 0) {

            gastoTotal = (nFrango * 4) + (nFrango * 7);

            JOptionPane.showMessageDialog(null, "A granja teve o gasto de R$"+corte.format(gastoTotal)+
                    " para marcar todos os frangos.");

        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridas informações invalidas.");
        }

    }
}
