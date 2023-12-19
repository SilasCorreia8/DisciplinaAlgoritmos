package correia.silas.algoritmos.Livro57_1a10;

import javax.swing.*;

/*
4. Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida ela possui. Considere
sempre anos completos, e que o ano possui 365 dias.
Ex: Uma pessoa com 19 anos possui 6935 dias de vida; veja um exemplo de saída;

Maria, Você já viveu 6935 dias.
*/
public class Exercicio4 {
    public static void main(String[] args) {

        String nome;

        int idade, dViveu;

        //Entrada de Dados
        nome = JOptionPane.showInputDialog(null, "Insira o seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade: "));

        if (idade >= 0) {

            //Calculo
            dViveu = idade * 365;

            //Apresentar Resultado
            JOptionPane.showMessageDialog(null, nome+" tem "+idade+" anos de idade e já "+
                    "viveu "+dViveu+" dias.");

        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridos informações inválidas.");
        }

    }
}
