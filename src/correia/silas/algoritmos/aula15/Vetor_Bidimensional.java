package correia.silas.algoritmos.aula15;

import javax.swing.*;

public class Vetor_Bidimensional {
    public static void main(String[] args) {
        
        float[][] gastos = new float[3][4];
        float soma = 0;
        
        String mostra = "";
        
        //Inicialização de vetor sem laço
        //double[][] gastos1 = {{8.0, 7.5, 8.5, 9.0}, {8.9, 9.0, 8.6, 8.4}, {8.9, 9.0, 8.6, 8.4}}
        
        //Prencher o vetor
        for (int i = 0; i < 3; i++) {
            
            mostra = mostra + "\n";
            
            for (int j = 0; j < 4; j++) {
                gastos[i][j] = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o " +
                        "valor:"));
                
                mostra = mostra + gastos[i][j] + " ";
                
                if (gastos[i][j] > 0) {
                    soma = soma + gastos[i][j];
                }
                
            }
        }
        
        JOptionPane.showMessageDialog(null, "Valores: "+mostra+
                "\nSoma dos valores: "+soma);
        
    }
}
