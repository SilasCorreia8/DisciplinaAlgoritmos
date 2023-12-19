package correia.silas.algoritmos.aula9;

/*
1. Construa um algoritmo que liste todos os números pares até 100.
2. Construa um algoritmo que liste todos os números impares até 100.
3. Crie um algoritmo que pergunte ao usuario se deseja somar dois números e some enquanto a resposta for "s".
4. Crie um algoritmo que mostre nome, endereço e telefone de um usúsario enquanto a resposta for "s" para a pergunta
bCadastro.
5. Crie um algoritmo que permite que o usúario erre no maximo três vezes sua autenticação (nome e senha). Caso erre
mais de três vezes mostra "Usúario Bloqueado".
*/

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {

        int n1, n2, soma;
        String SouN, stN1, stN2;

        SouN = JOptionPane.showInputDialog(null, "Deseja somar dois numeros?");

        if (SouN.equalsIgnoreCase("s")) {
            do {

                stN1 = JOptionPane.showInputDialog(null, "Digite o Primeiro valor:");
                stN2 = JOptionPane.showInputDialog(null, "Digite o Segundo valor:");

                n1 = Integer.parseInt(stN1);
                n2 = Integer.parseInt(stN2);

                soma = n1 + n2;

                JOptionPane.showMessageDialog(null, "A soma de "+n1+" + "+n2+" é "+soma);

                SouN = JOptionPane.showInputDialog(null, "Deseja somar dois numeros mais uma vez?");

            } while (SouN.equalsIgnoreCase("s"));

            JOptionPane.showMessageDialog(null, "Ok...");

        }
        else {
            JOptionPane.showMessageDialog(null, "Ok...");
        }

    }
}







