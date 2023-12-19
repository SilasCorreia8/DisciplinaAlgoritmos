package correia.silas.algoritmos.aula9;

/*
while = enquanto/repita

Teste no inicio
Não sei a quantidade que vai ser Executado
*/

import javax.swing.JOptionPane;

public class ComandoWhile {
    public static void main(String[] args) {

        int contador;
        String numero = "";

        contador = 0;

        while (contador <= 10) {
            numero = numero + contador;
            contador++;
        }

        JOptionPane.showMessageDialog(null, numero);

    }
}
