package correia.silas.algoritmos.aula9;

/*
do = faça

Quando será executado 1 vez o corpo do laço
*/

import javax.swing.JOptionPane;

public class ComandoDo {
    public static void main(String[] args) {

        int contador;
        String numero = "";

        contador = 0;

        do {
            numero = numero + contador;
            contador++;
        } while (contador <= 10);

        JOptionPane.showMessageDialog(null, numero);

    }
}
