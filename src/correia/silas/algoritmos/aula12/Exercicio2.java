package correia.silas.algoritmos.aula12;

/*
1. Crie um algoritmo que mostre a tabuada de somar do 1 ao 5.
2. Crie um algoritmo que mostre o seguinte padrão:
a)* * *
  * * *
  * * *
  * * *
b)*
  * *
  * * *
  * * * *
  * * * * *
c)* * * * *
  * * * *
  * * *
  * *
  *
*/

import javax.swing.*;

public class Exercicio2 {
    public static void main(String[] args) {

        int cont, cont2;

        String res = "";

        for (cont = 1; cont <= 3; cont++) {

            res = res + "* * *"+"\n";

        }

        for (cont = 1; cont <= 5; cont++) {

                for (cont2 = 1; cont2 <= cont; cont2++) {
                    res = res + " * ";
                }

            res = res + " "+"\n";

        }

        for (cont = 5; cont >= 1; cont--) {

            for (cont2 = 1; cont2 <= cont; cont2++) {
                res = res + " * ";
            }

            res = res + " "+"\n";

        }

        JOptionPane.showMessageDialog(null, res);

    }
}
