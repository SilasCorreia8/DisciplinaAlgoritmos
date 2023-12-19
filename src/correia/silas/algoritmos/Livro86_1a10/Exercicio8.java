package correia.silas.algoritmos.Livro86_1a10;

import javax.swing.*;
import java.text.DecimalFormat;

/*
8. Faça um algoritmo para ler um ponto (x, y) do plano cartesiano e exibir uma mensagem se está acima, abaixo ou
pertence a parábola x² -3x + 1 = 0.
*/
public class Exercicio8 {
    public static void main(String[] args) {

        double x, y, parabola;

        //Entrada de dados
        x = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a posição X: "));
        y = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a posição Y: "));

        parabola = x * x - 3 * x + 1;

        //corte casa decimais
        DecimalFormat corte = new DecimalFormat("#.#");

        //Calculo e apresentar resultados
        if (y > parabola) {
            JOptionPane.showMessageDialog(null, "O ponto "+corte.format(y)+" está acima da parábola.");
        }
        else if (y < parabola) {
            JOptionPane.showMessageDialog(null, "O ponto "+corte.format(y)+" está abaixo da parábola.");
        } else {
            JOptionPane.showMessageDialog(null, "O ponto "+corte.format(y)+" pertence a parábola.");
        }

    }
}
