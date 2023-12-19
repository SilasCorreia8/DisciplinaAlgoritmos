package correia.silas.algoritmos.Livro86_1a10;

import javax.swing.*;

/*
10. A eleição do síndico de um prédio teve três candidatos. Faça um algoritmo para ler o nome e o total dos votos de
cada candidato e informar qual foi o vencedor.
*/
public class Exercicio10 {
    public static void main(String[] args) {

        String nome1, nome2, nome3;

        int voto1, voto2, voto3;

        //Entrada de dados
        nome1 = JOptionPane.showInputDialog(null, "Informe o nome do primeiro candidato: ");
        voto1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de "+
                "voto do candidato "+nome1+": "));

        nome2 = JOptionPane.showInputDialog(null, "Informe o nome do segundo candidato: ");
        voto2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de "+
                "voto do candidato "+nome2+": "));

        nome3 = JOptionPane.showInputDialog(null, "Informe o nome do terceiro candidato: ");
        voto3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de "+
                "voto do candidato "+nome3+": "));

        //Calculo e apresentar resultado
        if (voto1 >= 0 && voto2 >= 0 && voto3 >= 0) {

            if (voto1 > voto2 && voto1 > voto3) {
                JOptionPane.showMessageDialog(null, "O candidato "+nome1+" foi o vencedor com "+
                        voto1+" votos.");
            }
            else if (voto2 > voto1 && voto2 > voto3) {
                JOptionPane.showMessageDialog(null, "O candidato "+nome2+" foi o vencedor com "+
                        voto2+" votos.");
            }
            else if (voto3 > voto1 && voto3 > voto2) {
                JOptionPane.showMessageDialog(null, "O candidato "+nome3+" foi o vencedor com "+
                        voto3+" votos.");
            }
            else if (voto1 == voto2 && voto2 == voto3) {
                JOptionPane.showMessageDialog(null, "Empate.");
            }

        }

    }
}
