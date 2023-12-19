package correia.silas.algoritmos.Livro57_1a10;

import javax.swing.*;
import java.text.DecimalFormat;

/*
10. Construa um algoritmo para calcular a distância entre dois pontos do plano cartesiano. Cada ponto é um par ordenado
(x,y).
*/
public class Exercicio10 {
    public static void main(String[] args) {

        double x1, x2, y1, y2, distancia;

        //Entrada dos primeiros dados
        x1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a posição x do "+
                "primeiro ponto: "));
        y1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a posição y do "+
                "primeiro ponto: "));

        //Entrada dos segundos dados
        x2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a posição x do "+
                "segundo ponto: "));

        y2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a posição y do "+
                "segundo ponto: "));

        //Calculo
        distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        //Corte de casas decimais
        DecimalFormat corte = new DecimalFormat("#.#");

        //Apresentar Resultado
        JOptionPane.showMessageDialog(null, "a distancia entre os dois pontos são: "+
                corte.format(distancia));

    }
}
