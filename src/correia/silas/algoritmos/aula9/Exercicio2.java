package correia.silas.algoritmos.aula9;

/*
1. Construa um algoritmo que liste todos os números pares até 100.
2. Construa um algoritmo que liste todos os números impares até 100.
3. Crie um algoritmo que pergunte ao usuario se deseja somar dois números e some enquanto a resposta for 5.
4. Crie um algoritmo que mostre nome, endereço e telefone de um usúsario enquanto a resposta for "s" para a pergunta
bCadastro.
5. Crie um algoritmo que permite que o usúario erre no maximo três vezes sua autenticação (nome e senha). Caso erre
mais de três vezes mostra "Usúario Bloqueado".
*/

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {

        int contador;
        String numero = "";

        contador = 1;

        while (contador <= 100) {
            numero = numero + contador;
            contador = contador + 2;
        }

        JOptionPane.showMessageDialog(null, numero);

    }
}
