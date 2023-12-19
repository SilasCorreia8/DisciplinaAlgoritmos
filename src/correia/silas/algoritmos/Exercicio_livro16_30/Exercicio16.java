package correia.silas.algoritmos.Exercicio_livro16_30;

/*
16. A lanchonete Gostosura vende apenas um tipo de saduiche, cujo recheio inclui duas fatias de queijo, uma fatia de
presento e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que a rodela
de hambúrguer pesa 100 gramas, faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, e a
máquina informe as quantidades em (quilos) de queijo, presunto e carne necessários para compra.
*/

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio16 {
    public static void main(String[] args) {

        int quantidade;
        double queijo, presunto, carne;

        String stQuantidade;

        stQuantidade = JOptionPane.showInputDialog(null, "Qual a quantidade de Hambúrguer");

        quantidade = Integer.parseInt(stQuantidade);

        DecimalFormat corte = new DecimalFormat("#.##");

        if (quantidade >= 0) {


            queijo = quantidade * 0.05;
            presunto = quantidade * 0.05;
            carne = quantidade * 0.1;

            JOptionPane.showMessageDialog(null, "É nescessario "+corte.format(queijo)+
                    "kg de queijo, "+corte.format(presunto)+ "kg de presunto e "+corte.format(carne)+"kg de carne para fazer "+
                    quantidade+" Hambúrgueres!!");

        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridas informações invalidas.");
        }

    }
}
