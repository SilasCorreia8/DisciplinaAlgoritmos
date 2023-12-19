package correia.silas.algoritmos.Exercicio_livro16_30;

/*
21. A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa
de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, faça um algoritmo para calcular
quantos litors de refrigerante ele comprou.
*/

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio21 {
    public static void main(String[] args) {

        int lata, garrafa600ml, garrafa2litros;
        double res;

        lata = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas latas de 350 ml foram "+
                "compradas: "));

        garrafa600ml = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantaws garrafas "+
                "de 600 ml foram compradas: "));

        garrafa2litros = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas garrafas "+
                "de 2 litros foram compradas: "));

        DecimalFormat corte = new DecimalFormat("#.##");

        if (lata >= 0 && garrafa600ml >= 0 && garrafa2litros >= 0) {

            res = (lata * 0.35) + (garrafa600ml * 0.6) + (garrafa2litros * 2);

            JOptionPane.showMessageDialog(null, "Foram comprados "+res+" litros de refrigerante.");

        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridas informações invalidas.");
        }

    }
}
