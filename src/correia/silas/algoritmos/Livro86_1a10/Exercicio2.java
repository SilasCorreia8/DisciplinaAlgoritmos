package correia.silas.algoritmos.Livro86_1a10;

import javax.swing.*;
import java.text.DecimalFormat;

/*
2. O índice de massa corpórea (IMC) é calculado a partir da seguinte fórmula: IMC = peso(kg) / altura²(m).
Faça um algoritmo para calcular e imprimir o IMC de uma pessoa, e depois exibir uma das seguintes mensagens:

IMC          Classificação
<18,5        Abaixo do peso
<25          Peso normal
<30          Sobrepeso
<35          Obeso leve
<40          Obeso moderado
>=40         Obeso mórbido
*/
public class Exercicio2 {
    public static void main(String[] args) {

        double peso, altura, imc;

        //Entrada de Dados
        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura: "));

        //Calculo
        imc = peso / (altura * altura);

        //Corte casas decimais
        DecimalFormat corte = new DecimalFormat("#.#");

        //Mostrar Resultado
        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Abaixo do peso: "+corte.format(imc));
        } else if (imc >= 18.5 && imc < 25) {
            JOptionPane.showMessageDialog(null, "Peso normal: "+corte.format(imc));
        } else if (imc >= 25 && imc < 30) {
            JOptionPane.showMessageDialog(null, "Sobrepeso: "+corte.format(imc));
        } else if (imc >= 30 && imc < 35) {
            JOptionPane.showMessageDialog(null, "Obeso leve: "+corte.format(imc));
        } else if (imc >= 35 && imc < 40) {
            JOptionPane.showMessageDialog(null, "Obeso moderado: "+corte.format(imc));
        } else if (imc >= 40) {
            JOptionPane.showMessageDialog(null, "Peso mórbido: "+corte.format(imc));
        }

    }
}
