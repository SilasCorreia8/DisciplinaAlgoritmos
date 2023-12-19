package correia.silas.algoritmos.Livro57_1a10;

import javax.swing.*;
import java.text.DecimalFormat;

/*
6. O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo que leia o peso do
prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a balança já desconte o peso do prato.
*/
public class Exercicio6 {
    public static void main(String[] args) {

        double kilo, pagar;

        //Entrada dos Dados
        kilo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do peso "+
                "que deu a refeição: "));

        if (kilo >= 0) {

            //Calculo
            pagar = kilo * 12;

            //Corte casas decimais
            DecimalFormat corte = new DecimalFormat("#.00");

            //Apresentar Resultado
            JOptionPane.showMessageDialog(null, "A sua refeição tem "+kilo+"kg."+
                    "\nO valor a ser pago é de R$"+corte.format(pagar));

        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridos valoris inválidos.");
        }

    }
}
