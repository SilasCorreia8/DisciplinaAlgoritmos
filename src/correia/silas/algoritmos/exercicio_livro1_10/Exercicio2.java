package correia.silas.algoritmos.exercicio_livro1_10;
/*
Ler a temperatura de uma pessoa e exibir a mensagem "Está com febre!" ou "Sem febre!".
Considere o valor base como 36.5.

Portugol:

var
    temperatura:Real
Inicio
    Leia(temperatura)
    Se (temp > 36.5) Entao
        Escreval("Está com febre!")
    senao
        Escreval("Está sem febre!")
Fim
*/

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {

        double temperatura;

        String stTemperatura;

        stTemperatura = JOptionPane.showInputDialog(null, "Digite a Temperatura:");

        temperatura = Double.parseDouble(stTemperatura);

        if (temperatura > 36.5) {
            JOptionPane.showMessageDialog(null, "Está com febre!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Está sem febre!");
        }
    }
}