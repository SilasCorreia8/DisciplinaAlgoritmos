package correia.silas.algoritmos.Exercicio_livro16_30;

/*
23. Num dia de Sol, você deseja medir a altura de um prédio, porém, a trena não é suficientemente longa. Assumindo que
seja possivel medir sua sombra e a do prédio no chão, e que você lembre da sua altura, faça um algoritmo para ler os
dados necessários e calcular a altura do prédio.
*/

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio23 {
    public static void main(String[] args) {

        double alturaPessoa = 2.00, sombraPessoa, sombraPredio, alturaPredio;

        sombraPessoa = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura "+
                "da sombra da pessoa: "));

        sombraPredio = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura "+
                "da sombra do prédio: "));

        DecimalFormat corte = new DecimalFormat("#.##");

        if (sombraPessoa >= 0 && sombraPredio >= 0) {

            alturaPredio = (sombraPredio / sombraPessoa) * alturaPessoa;

            JOptionPane.showMessageDialog(null, "A altura do prédio é: "+corte.format(alturaPredio)+
                    "m.");

        } else {
            JOptionPane.showMessageDialog(null, "Foram inseridas informações invalidas.");
        }

    }
}
