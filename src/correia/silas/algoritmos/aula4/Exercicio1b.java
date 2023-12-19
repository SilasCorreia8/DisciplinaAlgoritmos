package correia.silas.algoritmos.aula4;

/*
Construa um algoritmo para calcular a área das seguintes figuras: Retangulo de comprimento 4 e altura 2

var
    comp,alt,res:Inteiro
Inicio
    Leia(comp)
    Leia(alt)
    res <- comp * alt
    Escreval(res)
Fim
*/

import javax.swing.JOptionPane;

public class Exercicio1b {
    public static void main(String[] args){

        int comp, alt, res;
        String stComp, stAlt;

        stComp = JOptionPane.showInputDialog(null, "Digite o comprimento:");
        stAlt = JOptionPane.showInputDialog(null, "Digite a altura:");

        comp = Integer.parseInt(stComp);
        alt = Integer.parseInt(stAlt);

        res = comp * alt;

        JOptionPane.showMessageDialog(null, "O resultado da área do retangulo é: "+res);

    }
}
