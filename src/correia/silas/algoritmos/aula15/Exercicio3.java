package correia.silas.algoritmos.aula15;

/*
3. Faça um programa que leia 10 números inteiros, armazene-os em um vetor, solicite um valor de referência inteiro e:
a)Retorne quantas vezes o valor de referência aparece no vetor.
b)Retorne todos os números divisíveis pelo valor de referência.
*/

import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {

        int[] valores = new int[10];
        int contar = 0;
        int[] divisiveis = new int[contar];
        int j = 0;

        //Solicitar valor de Referência
        String valorRef = JOptionPane.showInputDialog(null, "Digite o valor de referência: ");
        int ref = Integer.parseInt(valorRef);

        for (int i = 0; i < valores.length; i++) {

            String valor = JOptionPane.showInputDialog(null, "Digite o "+(i+1)+"° valor: ");

            valores[i] = Integer.parseInt(valor);

        }

        //Conta quantas vezes o valor de referência aparece no vetor
        for (int i = 0; i < valores.length; i++) {

            if (valores[i] == ref) {
                contar++;
            }

        }

        //Armazena todos os números divisiveis pelo valor referência em um vetor
        for (int i = 0; i < valores.length; i++) {

            if (valores[i] % ref == 0) {
                divisiveis[j] = valores[i];
                j++;
            }

        }

        JOptionPane.showMessageDialog(null, "O valor de referência aparece "+contar+" vezees"+
                " no vetor."+
                "\nOs números de re");

    }
}
