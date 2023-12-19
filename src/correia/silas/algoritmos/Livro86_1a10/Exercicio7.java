package correia.silas.algoritmos.Livro86_1a10;

import javax.swing.*;
import java.text.DecimalFormat;

/*
7. Na escola Meu Jardim o aluno recebe quatros notas por disciplina. Faça um algoritmo para entrar com quatro notas,
o nome do aluno, calcular a média e dizer se o aluno foi aprovado ou reprovado. Considere aprovação para valor média
igual ou superior a seis.
*/
public class Exercicio7 {
    public static void main(String[] args) {

        double nota1, nota2, nota3, nota4, media;

        String nome;

        //Entrada de dados
        nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ");

        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a terceira nota: "));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quarta nota: "));

        //Calculo
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        //Corte casas decimais
        DecimalFormat corte = new DecimalFormat("#.#");

        //Apresentar Resultado
        if (nota1 >= 0 && nota2 >= 0 && nota3 >= 0 && nota4 >= 0) {

            if (media >= 6) {
                JOptionPane.showMessageDialog(null, "O aluno "+nome+" com as notas "+nota1+", "+
                        nota2+", "+nota3+" e "+nota4+".\nTeve a média "+corte.format(media)+" e foi aprovado");
            } else {
                JOptionPane.showMessageDialog(null, "O aluno "+nome+" com as notas "+nota1+", "+
                        nota2+", "+nota3+" e "+nota4+".\nTeve a média "+corte.format(media)+" e foi reprovado");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridos valores inválidos.");
        }
    }
}
