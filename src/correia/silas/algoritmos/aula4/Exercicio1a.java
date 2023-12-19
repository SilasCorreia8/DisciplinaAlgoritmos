package correia.silas.algoritmos.aula4;

// Construa um algoritmo para calcular a área das seguintes figuras: Quadrado de lado 2
// var
//     n1,res:Inteiro
// Inicio
//     leia(n1)
//     res <- n1 * n1
//     Escreval(res)
// Fim

import javax.swing.JOptionPane;

public class Exercicio1a {
    public static void main(String[] args) throws Exception {

        int n1, res;

        String stN1;


        stN1=JOptionPane.showInputDialog(null, "Digite o valor:");

        n1 = Integer.parseInt(stN1);

        res = n1 * n1;

        JOptionPane.showMessageDialog(null, "O quadrado de "+n1+" é: "+res);

    }
}