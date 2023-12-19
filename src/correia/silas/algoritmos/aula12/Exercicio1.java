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

public class Exercicio1 {
    public static void main(String[] args) {

        int cont, cont2, soma;
        String tabuada = "";

        for (cont=1;cont<=5;cont++) {

            for (cont2=1;cont2<=5;cont2++){

                soma = cont + cont2;
                tabuada = tabuada + cont+ " + " + cont2+ " = " + soma + "\n";
                //JOptionPane.showMessageDialog(null, "A soma de "+cont+" + "+cont2+ " é "+soma);


            }

        }

        JOptionPane.showMessageDialog(null, tabuada);

    }
}
