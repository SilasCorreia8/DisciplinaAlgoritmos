package correia.silas.algoritmos.Livro86_1a10;

import javax.swing.*;
import java.text.DecimalFormat;

/*
4. Uma maquina virtual recebe um valor e exibe o seu quadrado quando ele é par, e o seu cubo quando ele é ímpar. Faça
um algoritmo para esta máquina.
*/
public class Exercicio4 {
    public static void main(String[] args) {

        double valor, quadrado, cubo;

        //Entrada de dados
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor: "));

        //Corte casas decimais.
        DecimalFormat corte = new DecimalFormat("#.#");

        //Calculo e apresentar resultado
        if (valor % 2 == 0) {

            quadrado = valor * valor;

            JOptionPane.showMessageDialog(null, "O valor "+corte.format(valor)+" é par "+
                    "e o seu quadrado é "+corte.format(quadrado));

        } else {

            cubo = valor * valor * valor;

            JOptionPane.showMessageDialog(null, "O valor "+corte.format(valor)+" é impar "+
                    "e o seu cubo é "+corte.format(cubo));
        }

    }
}
