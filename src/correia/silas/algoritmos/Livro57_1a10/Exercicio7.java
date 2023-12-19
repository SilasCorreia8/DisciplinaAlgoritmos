package correia.silas.algoritmos.Livro57_1a10;

import javax.swing.*;

/*
7. Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o início do ano. Esqueça a questão
dos anos bissextos e considere sempre que um mês possui 30 dias.
*/
public class Exercicio7 {
    public static void main(String[] args) {

        int dia, mes, diasPassaram;

        //Entrada dos dados
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a data: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do mês: "));

        if (dia >= 0 && mes >= 0 && mes <= 12) {

            //Calculo
            diasPassaram = dia + ((mes - 1) * 30);

            //Apresentar o Resultado
            JOptionPane.showMessageDialog(null, "Se passaram "+diasPassaram+
                    " dias desde o início do ano");

        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridos valores inválidos.");
        }

    }
}
