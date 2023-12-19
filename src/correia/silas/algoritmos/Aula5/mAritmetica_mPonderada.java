package correia.silas.algoritmos.Aula5;

/*
Escrever um algoritmo que lê um valor X inteiro e positivo e 3 valores a, b e c também inteiros e positivos.
Se o valor de X for par então calcular a média aritmética de a, b e c, fórmula (a+b+c)/3 e se X>10 então
calcular a média ponderada de a, b e c, os pesos dos valores são respectivamente 2, 3 e 4,
formula ((a*2)+(b*3)+(c*4))/9. Caso contrário escreva "numero ímpar".

*/

import javax.swing.JOptionPane;

public class mAritmetica_mPonderada {
    public static void main(String[] args) {

        int x, a, b, c;
        double ma, mp;

        String stX, stA, stB, stC;

        stX = JOptionPane.showInputDialog(null, "Digite o valor de x:");
        stA = JOptionPane.showInputDialog(null, "Digite o valor de a:");
        stB = JOptionPane.showInputDialog(null, "Digite o valor de b:");
        stC = JOptionPane.showInputDialog(null, "Digite o valor de c:");

        x = Integer.parseInt(stX);
        a = Integer.parseInt(stA);
        b = Integer.parseInt(stB);
        c = Integer.parseInt(stC);

        if (x % 2 == 0) {

            ma = (a+b+c) / 3;

            JOptionPane.showMessageDialog(null, "O valor de x é par e sua média aritmética é: "+ma);

            if (x > 10) {

                mp = ((a*2)+(b*3)+(c*4)) / 9;
                JOptionPane.showMessageDialog(null, "A média ponderada do valor de x é: "+mp);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "O valor de x é impar");
        }

    }
}
