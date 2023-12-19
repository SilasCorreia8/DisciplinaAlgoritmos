package correia.silas.algoritmos.aula9;

/*
for = para

Sei a quantidade que vai ser executado
*/

import javax.swing.JOptionPane;

public class ComandoFor {
    public static void main(String[] args) {

        int contador;
        String numero="";

        for (contador = 0; contador <= 10; contador++) {
            numero = numero + contador + " ";
        }

        JOptionPane.showMessageDialog(null, numero);

    }
}
