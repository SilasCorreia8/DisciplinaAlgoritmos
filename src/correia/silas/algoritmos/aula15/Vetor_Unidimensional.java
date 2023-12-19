package correia.silas.algoritmos.aula15;

import javax.swing.*;

public class Vetor_Unidimensional {
    public static void main(String[] args) {

        int v1[] = new int[5];
        int v2[] = new int[5];

        String resultV1 = "", resultV2 = "";

        //Prencher v1
        for (int i =0; i < v1.length; i++) {
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número:"));
        }

        //Prencher v2
        for (int i = 0; i < v2.length; i++) {
            v2[i] = v1[i];
        }

        //Resultado v1
        for (int i = 0; i < v1.length; i++) {
            resultV1 = resultV1 + v1[i] + " ";
        }

        //Resultado v2
        for (int i = 0; i < v2.length; i++) {
            resultV2 = resultV2 + v2[i] + " ";
        }

        //Mostrar Resultados
        JOptionPane.showMessageDialog(null, "Vetor 1: "+resultV1+
                "\nVetor 2: "+resultV2);

    }
}
