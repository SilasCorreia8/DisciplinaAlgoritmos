package correia.silas.algoritmos.Livro57_1a10;

import javax.swing.*;

/*
1. A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as dimenssões de um terrreno e
depois exibir a área do terreno.
*/
public class Exercicio1 {
    public static void main(String[] args) {

        double base, altura, area;

        //Entrada dos Dados
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a base: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura: "));

        //Calculo
        area = base * altura;

        //Apresentar Resultado
        JOptionPane.showMessageDialog(null, "A área do retangulo com base "+base+
                " e altura "+altura+" é "+area);

    }
}
