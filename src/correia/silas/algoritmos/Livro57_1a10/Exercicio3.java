package correia.silas.algoritmos.Livro57_1a10;

import javax.swing.*;
import java.text.DecimalFormat;

/*
3. A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. Cada pãozinho
custa R$0,12 e a broa custa R$1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas
(juntos), e quanto deve guarda numa conta de poupança (10% do total arrecadado). Você foi contratado para fazer os
cálculos para o dono. Com base nestes fatos. Faça um algoritmo para ler as quantidades de pães e de broas, e depois
calcular os dados solicitados.
*/
public class Exercicio3 {
    public static void main(String[] args) {

        double pao, broa, totalReais, poupanca;

        //Entrada dos dados
        pao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantos pães "+
                "foram vendidos: "));
        broa = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantas broas "+
                "foram vendidas: "));

        if (pao >= 0 && broa >= 0) {

            //Calculo
            totalReais = (pao * 0.12) + (broa * 1.50);
            poupanca = totalReais * 0.1;

            //Corte de casas decimais
            DecimalFormat corte = new DecimalFormat("#.##");

            //Apresenta Resultado
            JOptionPane.showMessageDialog(null, "Pães vendidos: "+pao+
                    "\nBroas vendidas: "+broa+
                    "\nTotal arrecadado no dia: R$"+totalReais+
                    "\nValor a ser guardado na poupança: R$"+corte.format(poupanca));

        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridos valores inválidos.");
        }

    }
}
