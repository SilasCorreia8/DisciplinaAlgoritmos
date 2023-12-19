package correia.silas.algoritmos.aula4;

// Construa um algoritmo para calcular a área das seguintes figuras: Trapezio de lado maoir 5 e lado menor 3
//var
//    bMaior, bMenor, alt, res:Inteiro
//Inicio
//    Leia(bMaior)
//    Leia(bMenor)
//    Leia(alt)
//    res <- (bMaior + bMenor) * alt / 2
//    Escreval(res)
//Fim

import javax.swing.JOptionPane;

public class Exercicio1c {
    public static void main(String[] args) {

        int bMaior, bMenor, alt, res;

        String stBMaior, stBMenor, stAlt;

        stBMaior=JOptionPane.showInputDialog(null, "Digite o valor da base maior:");
        stBMenor=JOptionPane.showInputDialog(null, "Digite o valor da base menor:");
        stAlt=JOptionPane.showInputDialog(null, "Digite o valor da altura:");

        bMaior = Integer.parseInt(stBMaior);
        bMenor = Integer.parseInt(stBMenor);
        alt = Integer.parseInt(stAlt);

        res = (bMaior + bMenor) * alt /2;

        JOptionPane.showMessageDialog(null, "O trapezio de lado maior "+bMaior+" e lado menor "+bMenor+" e altura "+alt+" é: "+res);

    }
}
