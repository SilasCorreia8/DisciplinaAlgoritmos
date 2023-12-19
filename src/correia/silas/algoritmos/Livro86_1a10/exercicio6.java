package correia.silas.algoritmos.Livro86_1a10;

import javax.swing.*;

/*
6. Entrar com o ano e informa se o mesmo é bissexto ou não. Informe-se sobre como funciona o ano bissexto.
*/
public class exercicio6 {
    public static void main(String[] args) {

        int ano;


        //Entrada de dados
        ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano: "));

        //Calculo e apresentar resultado
        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            JOptionPane.showMessageDialog(null, "O ano "+ano+" é um ano bissexto.");
        } else {
            JOptionPane.showMessageDialog(null, "O ano "+ano+" não é um ano bissexto.");
        }

    }
}
