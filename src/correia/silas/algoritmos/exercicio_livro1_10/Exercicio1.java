package correia.silas.algoritmos.exercicio_livro1_10;
/*
    1. Entrar com uma distância (km) e o tempo de viagem (Horas) de um automóvel, e dizer se a velocidade média
    foi superior ao limite (110Km/h) ou não.

Portugol:

var
    km, hora, velocidadeM:Real
Inicio
    Leia(km)
    Leia(hora)
    velocidadeM <- km/hora
    Se (velocidadeM > 110) {
        Escreval("A velocidade média é superior ao limite")
    }
    senao {
        Escreval("A velocidade média é inferior ao limite")
    }
    Fimse
Fim
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio1 {
    public static void main(String[] args) {

        double km, hora, velocidadeM;

        String stKm, stHora;

        stKm = JOptionPane.showInputDialog(null, "Digite a distancia:");
        stHora = JOptionPane.showInputDialog(null, "Digite em quantas horas foi feita a viagem em  notação decimal:");

        km = Double.parseDouble(stKm);
        hora = Double.parseDouble(stHora);

        DecimalFormat corte = new DecimalFormat("0");
        velocidadeM = km/hora;

        if (velocidadeM > 110) {
            JOptionPane.showMessageDialog(null, "A velocidade média é superior ao limite. "+corte.format(velocidadeM)+"km/h");
        }
        else {
            JOptionPane.showMessageDialog(null, "A velocidade média está dentro do limite. "+corte.format(velocidadeM)+"km/h");
        }
    }
}
