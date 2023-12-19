package correia.silas.algoritmos.Livro57_1a10;

import javax.swing.*;
import java.text.DecimalFormat;

/*
8. Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a sua média ponderada
(as notas tem pesos respectivos de 1, 2 e 3).
*/
public class Exercicio8 {
    public static void main(String[] args) {

        double nota1, nota2, nota3, mediaP;

        //Entrada de Dados
        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a terceira nota: "));

        if (nota1 >= 0 && nota2 >= 0 && nota3 >= 0) {

            //Calculo
            mediaP = (nota1 + nota2 + nota3) / 3;

            //Corte de casas decimais
            DecimalFormat corte = new DecimalFormat("#.#");

            //Apresentar Resultado
            JOptionPane.showMessageDialog(null, "A média ponderada das notas: "+nota1+", "+
                    nota2+" e "+nota3+" é "+corte.format(mediaP));

        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridos valores inválidos.");
        }

    }
}
