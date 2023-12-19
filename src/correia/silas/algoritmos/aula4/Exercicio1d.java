package correia.silas.algoritmos.aula4;

// Construa um algoritmo para calcular a área das seguintes figuras: Circulo de raio 6
//var
//    raio,res:Inteiro
//Inicio
//    Leia(raio)
//    res <- 3,14 * (raio*raio)
//    Escreval(res)
//Fim

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio1d {
    public static void main(String[] args) {

        double raio, res;

        String stRaio;

        stRaio=JOptionPane.showInputDialog(null, "Digite o raio:");

        raio = Double.parseDouble(stRaio);

        DecimalFormat corte = new DecimalFormat("0.00");
        res = 3.14 * (raio*raio);

        JOptionPane.showMessageDialog(null, "O resultado com o raio "+raio+" é: "+corte.format(res));

    }
}
