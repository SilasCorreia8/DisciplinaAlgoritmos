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

public class Exercicio5 {
    public static void main(String[] args) {

        int cont = 0;
        String usuario = "Silas", senha = "1234";

        usuario = JOptionPane.showInputDialog(null, "Digite o Usúario:");
        senha = JOptionPane.showInputDialog(null, "Digite a Senha:");

        if (usuario.equals("Silas") && senha.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Usúario e Senha corretos!!");

        } else {
            do {
                JOptionPane.showMessageDialog(null, "Usúario ou Senha inválida!");

                usuario = JOptionPane.showInputDialog(null, "Digite o Usúario novamente::");
                senha = JOptionPane.showInputDialog(null, "Digite a Senha novamente:");

                if (usuario.equals("Silas") && senha.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Usúario e Senha corretos!!");
                    break;
                }
                else {
                    cont++;
                }

            } while (cont < 2);

            if (cont == 2) {
                JOptionPane.showMessageDialog(null, "Usúario ou Senha inválidos.\nO usúario tentou " +
                        "por 3 vesez e não conseguiu e por isso foi bloqueado.");
            }

        }

    }
    
}
