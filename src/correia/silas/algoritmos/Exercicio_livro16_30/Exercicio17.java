package correia.silas.algoritmos.Exercicio_livro16_30;

/*
17. Alguns países medem a temperaturas em graus Celsius, e outros em graus Fahrenheit. Faça um algoritmo para ler uma
temperatura Celsius e imprimi-la em Fahrenheit (pesquise como este tipo de conversão).
*/

import javax.swing.*;

public class Exercicio17 {
    public static void main(String[] args) {

        double celsius, fahrenheit;

        String stCelsius;

        stCelsius = JOptionPane.showInputDialog(null, "Informe o graus (Celsius):");

        celsius = Integer.parseInt(stCelsius);

        fahrenheit = (celsius * 1.8) + 32;

        JOptionPane.showMessageDialog(null, celsius+"° graus Celsius convertido para "+
                "Fahrenheit é: "+fahrenheit);

    }
}
