package correia.silas.algoritmos.Livro86_1a10;

import javax.swing.*;

/*
5. Entrar com a distancia percorrida (Km) e a quantidade de combustível (Litros) gasto. Depois informe quantos
quilômetros são percorridos por litro. Sabendo que um carro econômico percorre 15km/l, diga se o veículo em questão
é econômico ou não.
*/
public class Exercicio5 {
    public static void main(String[] args) {

        double km, l, media;

        //Entrada de dados
        km = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos km foram percorridos: "));
        l = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos litros foram gastos: "));

        //Calculo
        media = km / l;

        //Apresentar Resultado
        if (km > 0 && media >= 15) {
            JOptionPane.showMessageDialog(null, "O veículo é econômico.");
        } else if (km > 0 && media > 0) {
            JOptionPane.showMessageDialog(null, "O veículo não é econôico.");
        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridos informações inválidas.");
        }

    }
}
