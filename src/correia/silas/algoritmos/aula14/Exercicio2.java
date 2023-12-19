package correia.silas.algoritmos.aula14;

/*
2. Crie um algoritmo que lê 5 nomes de alunos e em seguida faça uma pesquisa que procure por um dos nomes. Caso não
ache retorne "Aluno inexistenete.".
*/

import javax.swing.*;

public class Exercicio2 {
    public static void main(String[] args) {

        String nome[] = new String[5];
        String nomeAluno = "Aluno inexistente!", pesquisa;


        //Armazenar os nomes
        for (int i = 0; i <=4; i++) {

            nome[i] = JOptionPane.showInputDialog(null, "Insira o nome do aluno:");

        }

        //Procurar aluno
        for (int r = 0;r < 1;r++) {

            pesquisa = JOptionPane.showInputDialog(null, "Insira o nome do aluno que deseja "
                    +"encontrar:");

            if (nome[r].equals(pesquisa)) {

                nomeAluno = pesquisa;

                //Mostrar resultado
                JOptionPane.showMessageDialog(null,"O aluno "+nomeAluno+" está matriculado!");

            } else {
                //Mostrar resultado
                JOptionPane.showMessageDialog(null, nomeAluno);
            }

        }

    }
}
