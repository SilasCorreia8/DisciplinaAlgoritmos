package correia.silas.algoritmos.aula16;

/*
3. Usando recursividade, calcule a soma de todos os valores de
um array de reais v.
Base: tamanho = 0 soma=0
recursão: v[n-1] + soma do restante do array.
*/

import javax.swing.*;

public class Exercicio3 {

    //Assinatura do Metodo
    public static double somaV (double[] v, int tamanhoV) {

        //Caso Base
        if (tamanhoV == 0) {
            return 0;
        } else {
            //Calculo / Caso Geral
            return v[tamanhoV-1] + somaV(v, tamanhoV - 1);
        }

    }

    public static void main(String[] args) {

        int tamVetor;

        tamVetor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamnho do vetor: "));

        double[] vetor = new double[tamVetor];

        for (int i = 0; i < tamVetor; i++) {

            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o "+(i+1)+"° "+
                    "valor: "));

        }

        //Resultado Final
        JOptionPane.showMessageDialog(null, "A soma dos valores: "+somaV(vetor, tamVetor));

    }
}
