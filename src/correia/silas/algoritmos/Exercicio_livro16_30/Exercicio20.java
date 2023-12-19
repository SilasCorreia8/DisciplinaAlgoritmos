package correia.silas.algoritmos.Exercicio_livro16_30;

/*
20. Uma cofecção produz X blusas de lã e para isto gasta uma certa quantidade de novelos. faça um algoritmo para
calcular quantos novelos de lã gasta por blusa.
*/

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio20 {
    public static void main(String[] args) {

        int blusas;
        double qNovelos, res;

        blusas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas blusas foram "+
                "confeccionadas: "));

        qNovelos = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos novelos de "+
                "lã foram gastos: "));

        DecimalFormat corte = new DecimalFormat("#.##");

        if (blusas >= 0 && qNovelos >= 0) {

            res = qNovelos / blusas;

            JOptionPane.showMessageDialog(null, "Foram gastos "+corte.format(res)+" novelos de "+
                    "lã para confeccionar "+blusas+" blusas.");

        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridas informações invalidas.");
        }

    }
}
