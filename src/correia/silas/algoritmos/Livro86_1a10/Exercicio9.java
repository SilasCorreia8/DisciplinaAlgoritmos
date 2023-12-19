package correia.silas.algoritmos.Livro86_1a10;

import javax.swing.*;

/*
9. Faça um algoritmo para ler a idade de uma pessoa e imprimir as mensagens:
Para maior de idade: Você é maior de idade.
Para menor de idade: Você é menor de idade
                     Ainda faltam <x> anos para ser maior de idade.
*/
public class Exercicio9 {
    public static void main(String[] args) {

        int idade, qunatosAnosFaltam;

        //Entrada de dados
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade: "));

        //Calculo e mostrar resultado
        if (idade >= 18 && idade <= 120) {
            JOptionPane.showMessageDialog(null, "Você é maior de idade.");
        } else if (idade >= 0 && idade < 18) {

            qunatosAnosFaltam = 18 - idade;

            JOptionPane.showMessageDialog(null, "Você é menor de idade."+
                    "\nFaltam "+qunatosAnosFaltam+" ano(s) para ser maior de idade.");
        }

    }
}
