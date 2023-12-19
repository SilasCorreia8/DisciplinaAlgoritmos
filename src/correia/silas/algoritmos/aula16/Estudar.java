package correia.silas.algoritmos.aula16;

/*
3. Usando recursividade, calcule a soma de todos os valores de
um array de reais v.
Base: tamanho = 0 soma=0
recursão: v[n-1] + soma do restante do array.
*/

import javax.swing.*;

public class Estudar {

    public static double somaA (double[] v, int tamanhoArray) {

        //Caso Base
        if (tamanhoArray == 0) {
            return 0;
        }
        //Calculo e Caso Geral
        else {
            return v[tamanhoArray - 1] + somaA(v, tamanhoArray - 1);
        }

    }

    public static void main(String[] args) {

        int tamArray;

        tamArray = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho do "+
                "Array: "));

        double[] valores = new double[tamArray];

        for (int i = 0; i < tamArray; i++) {
            valores[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o "+
                    (i + 1)+"° valor: "));
        }

        JOptionPane.showMessageDialog(null, somaA(valores, tamArray));

    }
}
