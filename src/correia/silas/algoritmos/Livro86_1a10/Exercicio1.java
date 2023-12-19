package correia.silas.algoritmos.Livro86_1a10;

import javax.swing.*;
import java.text.DecimalFormat;

/*
1. A partir do saldo bancário inicial, um cliente teve débitos e créditos ao longo do mês. Faça um algoritmo para ler o
saldo inicial, o total de débitos e o total de créditos, e depois escrever o saldo final do cliente através da mensagem
"Saldo positivo em R$xx" ou "Saldo negativo em R$xx" ou "Saldo zero".
*/
public class Exercicio1 {
    public static void main(String[] args) {

        double saldoIncial, tDebitos, tCreditos, saldoFinal;

        //Entrada de dados
        saldoIncial = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o saldo "+
                "inicial: "));
        tDebitos = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o total de "+
                "debitos: "));
        tCreditos = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o total de "+
                "créditos: "));

        //Calculo
        saldoFinal = saldoIncial - (tCreditos + tDebitos);

        //Corte casas decimais
        DecimalFormat corte = new DecimalFormat("#.00");

        //Apresentar Resultados
        if (saldoFinal > 0) {
            JOptionPane.showMessageDialog(null, "Saldo positivo em R$"+corte.format(saldoFinal));
        } else if (saldoFinal < 0) {
            JOptionPane.showMessageDialog(null, "Saldo negativo em R$"+corte.format(saldoFinal));
        } else {
            JOptionPane.showMessageDialog(null, "Saldo zero.");
        }

    }
}
