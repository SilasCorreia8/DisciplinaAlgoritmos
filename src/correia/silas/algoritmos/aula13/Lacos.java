package correia.silas.algoritmos.aula13;

import javax.swing.*;

public class Lacos {
    public static void main(String[] args) {

        for (int aumenta = 0, diminui = 0; aumenta < 10; aumenta++, diminui++){
            JOptionPane.showMessageDialog(null,"Laço = "+aumenta+" "+(aumenta+diminui));
        }

        //Laço com incremento de duas variaveis
        for (int aumenta = 0, diminui = 0; aumenta < 5; aumenta++, diminui++) {
            JOptionPane.showMessageDialog(null,"Laço = "+aumenta+" "+(aumenta+diminui));
        }

        //Laço com decremento
        for (int diminui = 5; diminui > 0; diminui--) {
            JOptionPane.showMessageDialog(null,"Contagem Regressiva "+diminui);
        }

        //Laço com decremento de duas variaveis
        for (int aumenta = 0, diminui = 5; aumenta <=5; aumenta++, diminui--){
            JOptionPane.showMessageDialog(null, "Laço = "+aumenta+" + "+ diminui+" soma = "+(aumenta+diminui));
        }

    }
}
