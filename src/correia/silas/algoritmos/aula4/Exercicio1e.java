package correia.silas.algoritmos.aula4;

// Construa um algoritmo para calcular a área das seguintes figuras: Triangulo retangulo de base 7 e altura 4
//var
//    base, alt:Inteiro
//    res:Real
//Inicio
//    Leia(base)
//    Leira(alt)
//    res <- base *alt / 2
//    Escreval(res)
//Fim

import javax.swing.JOptionPane;

public class Exercicio1e {
    public static void main(String[] args) {

        double base, alt, res;

        String stBase, stAlt;

        stBase=JOptionPane.showInputDialog(null, "Digite o valor da base:");
        stAlt=JOptionPane.showInputDialog(null, "Digitte o valor da altura:");

        base=Double.parseDouble(stBase);
        alt=Double.parseDouble(stAlt);

        res = base * alt / 2;

        JOptionPane.showMessageDialog(null, "O resultado com a base: "+base+" e com a altura: "+alt+" é: "+res);

    }
}
