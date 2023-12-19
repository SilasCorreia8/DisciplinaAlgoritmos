package correia.silas.algoritmos.Exercicio_livro16_30;

/*
22. Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais conseguiu poupar. Faça um algoritmo para
ler a quantidade de cada tipo de moeda, e imprimir o valor total economizado, em reais. Considere que existam moedas de
1, 5, 10, 25 e 50 centavos, e ainda moedas de 1 real. Não havendo moeda de um tipo, a quantidade respectiva é zero.
*/

import javax.swing.*;

public class Exercicio22 {
    public static void main(String[] args) {

        int centavo1, centavos5, centavos10, centavos25, centavos50, real1;
        double totalReais;

        String mostrar = "";

        centavo1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas moedas de 1 "+
                "Centavo"));

        centavos5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas moedas de 5 "+
                "centavos"));

        centavos10 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas moedas de 10 "+
                "Centavos"));

        centavos25 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas moedas de 25 "+
                "Centavos"));

        centavos50 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas moedas de 50 "+
                "Centavos"));

        real1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas moedas de 1 Real"));



        if (centavo1 >= 0 && centavos5 >= 0 && centavos10 >= 0 && centavos25 >= 0 && centavos50 >= 0 && real1 >= 0) {

            totalReais = (centavo1 * 0.01) + (centavos5 * 0.05) + (centavos10 * 0.1) + (centavos25 * 0.25) +
                    (centavos50 * 0.5) + (real1);

            mostrar = mostrar + "Moedas de 1 Centavo: "+centavo1+
                    "\nMoedas de 5 Centavos: "+centavos5+
                    "\nMoedas de 10 Centavos: "+centavos10+
                    "\nMoedas de 25 Centavos: "+centavos25+
                    "\nMoedas de 50 Centavos: "+centavos50+
                    "\nMoedas de 1 Real: "+real1+
                    "\nTotal de Reais economizados: R$"+totalReais;

            JOptionPane.showMessageDialog(null, mostrar);

        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridas informações invalidas.");
        }

    }
}
