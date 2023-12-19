package correia.silas.algoritmos.Livro57_1a10;

import javax.swing.*;

/*
2. Faça um algoritmo para calcular quantas ferraduras são nescessárias para equipar todos os cavalos comprados para
um haras.
*/
public class Exercicio2 {
    public static void main(String[] args) {

        int qCavalos, tFerraduras;

        //Entrada dos dados
        qCavalos = Integer.parseInt(JOptionPane.showInputDialog(null, "informe a quantidade "+
                "de cavalos: "));

        if (qCavalos >= 0) {

            //Calculo
            tFerraduras = qCavalos * 4;

            //Apresentar Resultado
            JOptionPane.showMessageDialog(null, "São nescessários "+tFerraduras+" ferraduras "+
                    "para "+qCavalos+" cavalo(s).");
        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridos valores inválidos.");
        }

    }
}
