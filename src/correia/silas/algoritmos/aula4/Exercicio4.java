package correia.silas.algoritmos.aula4;

/*
Crie um algoritmo que calcule o Indice de Massa Corporia (IMC) de uma pessoa. IMC = p/a²

var
    peso,altura,res:Real
Inicio
    Leia(peso)
    Leia(altura)
    res <- peso / (altura * altura)
    Escreval(res)
Fim
*/

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio4 {
    public static void main(String[] args) {

        double peso, altura, res;

        String stPeso, stAltura;

        stPeso = JOptionPane.showInputDialog(null, "Digite o Peso:");
        stAltura= JOptionPane.showInputDialog(null, "Digite a Altura:");

        peso = Double.parseDouble(stPeso);
        altura = Double.parseDouble(stAltura);

        DecimalFormat corte = new DecimalFormat("0.00");

        res = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, "O Indice de Massa Corporia "+"IMC"+" da pessoa com o peso igual a: "+peso+" e a altura igual a: "+altura+" é "+corte.format(res));
    }
}
