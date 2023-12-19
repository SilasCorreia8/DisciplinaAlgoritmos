package correia.silas.algoritmos.Livro86_1a10;

import javax.swing.*;
import java.text.DecimalFormat;

/*
3. Os ingressos no cinema Belas Artes custam X reais. Na terça-feira há um desconto de 50%, e em qualquer dia, menores
de 14 anos também têm um desconto de 50%. Faça um algoritmo que, seno lidos o dia da semana, a idade do espectador e o
preço base do ingresso, imprima o valor a pagar. Considere que dia 1 é domingo, 2 é segunda-feira, etc.

Ex: ingresso na terça-feira para um espectador de 11 anos, com preço base de R$12,00 - o valor a pagar é de R$3,00
*/
public class Exercicio3 {
    public static void main(String[] args) {

        double precoB, tAPagar;
        int dia, idade;

        //Entrada de dados
        precoB = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço base: "));
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Infome o dia da semana."+
                        "\nEx: 1 para domingo, 2 para segunda e etc.. :"));
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade: "));

        //Corte casas decimais
        DecimalFormat corte = new DecimalFormat("#.00");

        if (idade >= 0) {

            switch (dia) {
                case 1:
                    if (idade <= 14) {

                        tAPagar = precoB * 0.5;

                        JOptionPane.showMessageDialog(null, "Ingresso no Domingo para um "+
                                "espectador de "+idade+" anos, com o preço base de R$"+corte.format(precoB)+"."+
                                "\nO valor a ser pago é de R$"+corte.format(tAPagar)+".");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingresso no Domingo para um "+
                                "espectador de "+idade+" anos, com o preço base de R$"+corte.format(precoB)+"."+
                                "\nO valor a ser pago é de R$"+corte.format(precoB)+".");
                    }
                    break;
                case 2:
                    if (idade <= 14) {

                        tAPagar = precoB * 0.5;

                        JOptionPane.showMessageDialog(null, "Ingresso na Segunda-feira para um "+
                                "espectador de "+idade+" anos, com o preço base de R$"+corte.format(precoB)+"."+
                                "\nO valor a ser pago é de R$"+corte.format(tAPagar)+".");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingresso na Segunda-feira para um "+
                                "espectador de "+idade+" anos, com o preço base de R$"+corte.format(precoB)+"."+
                                "\nO valor a ser pago é de R$"+corte.format(precoB)+".");
                    }
                    break;
                case 3:
                    if (idade <= 14) {

                        tAPagar = precoB * 0.25;

                        JOptionPane.showMessageDialog(null, "Ingresso na Terça-feira para um "+
                                "espectador de "+idade+" anos, com o preço base de R$"+corte.format(precoB)+"."+
                                "\nO valor a ser pago é de R$"+corte.format(tAPagar)+".");
                    } else {

                        tAPagar = precoB * 0.5;

                        JOptionPane.showMessageDialog(null, "Ingresso na Terça-feira para um "+
                                "espectador de "+idade+" anos, com o preço base de R$"+corte.format(precoB)+"."+
                                "\nO valor a ser pago é de R$"+corte.format(tAPagar)+".");
                    }
                    break;
                case 4:
                    if (idade <= 14) {

                        tAPagar = precoB * 0.5;

                        JOptionPane.showMessageDialog(null, "Ingresso na Quarta-feira para um "+
                                "espectador de "+idade+" anos, com o preço base de R$"+corte.format(precoB)+"."+
                                "\nO valor a ser pago é de R$"+corte.format(tAPagar)+".");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingresso na Quarta-feira para um "+
                                "espectador de "+idade+" anos, com o preço base de R$"+corte.format(precoB)+"."+
                                "\nO valor a ser pago é de R$"+corte.format(precoB)+".");
                    }
                    break;
                case 5:
                    if (idade <= 14) {

                        tAPagar = precoB * 0.5;

                        JOptionPane.showMessageDialog(null, "Ingresso na Qinta-feira para um "+
                                "espectador de "+idade+" anos, com o preço base de R$"+corte.format(precoB)+"."+
                                "\nO valor a ser pago é de R$"+corte.format(tAPagar)+".");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingresso na Qinta-feira para um "+
                                "espectador de "+idade+" anos, com o preço base de R$"+corte.format(precoB)+"."+
                                "\nO valor a ser pago é de R$"+corte.format(precoB)+".");
                    }
                    break;
                case 6:
                    if (idade <= 14) {

                        tAPagar = precoB * 0.5;

                        JOptionPane.showMessageDialog(null, "Ingresso na Sexta-feira para um "+
                                "espectador de "+idade+" anos, com o preço base de R$"+corte.format(precoB)+"."+
                                "\nO valor a ser pago é de R$"+corte.format(tAPagar)+".");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingresso na Sexta-feita para um "+
                                "espectador de "+idade+" anos, com o preço base de R$"+corte.format(precoB)+"."+
                                "\nO valor a ser pago é de R$"+corte.format(precoB)+".");
                    }
                    break;
                case 7:
                    if (idade <= 14) {

                        tAPagar = precoB * 0.5;

                        JOptionPane.showMessageDialog(null, "Ingresso na Sabado para um "+
                                "espectador de "+idade+" anos, com o preço base de R$"+corte.format(precoB)+"."+
                                "\nO valor a ser pago é de R$"+corte.format(tAPagar)+".");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingresso na Sabado para um "+
                                "espectador de "+idade+" anos, com o preço base de R$"+corte.format(precoB)+"."+
                                "\nO valor a ser pago é de R$"+corte.format(precoB)+".");
                    }
                    break;
            }

        }

    }
}
