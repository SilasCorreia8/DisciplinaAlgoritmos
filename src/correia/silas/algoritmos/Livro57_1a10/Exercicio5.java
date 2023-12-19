package correia.silas.algoritmos.Livro57_1a10;

import javax.swing.*;
import java.text.DecimalFormat;

/*
5. Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o preço do litro da
gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no tanque.
*/
public class Exercicio5 {
    public static void main(String[] args) {

        double preco, tPagar, litroGasolina;

        //Entrada de Dados
        preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço "+
                "da gasolina: "));
        tPagar = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos Reais deseja "+
                "colocar: "));

        if (preco >= 0 && tPagar >= 0) {

            //Calculo
            litroGasolina = tPagar / preco;

            //Corte casasa decimais
            DecimalFormat corte = new DecimalFormat("#.#");

            //Apresentar Resultado
            JOptionPane.showMessageDialog(null, "Você colocou "+corte.format(litroGasolina)+
                    "l de gasolina");

        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridas informações inválidas.");
        }

    }
}
