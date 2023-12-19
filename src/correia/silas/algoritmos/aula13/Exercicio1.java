package correia.silas.algoritmos.aula13;

/*
1. A Mediana (Md) representa o valor central de um conjunto de dados. Construa um algoritmo que encontre a mediana num
conjunto de dados impares. Ex. Mediana dos númeors até 5. (1 2 *3 4 5). (Laço com duas variáveis).

2. Construa um algoritmo que gere uma tabela com a conversão de graus Celsius para Fahrenheit, com valares variando de
1 grau em 1 grau, de 0 a 10 graus CElsius. Utilize a fórmula f = c * 1.8 + 32. (utilize decremento).

3. Construa um algoritmo para exibir a soma dos 100 primieros números pares (utilize decremento de 2).

4. Construa um algoritmo que mostre há quantos anos o irmão  mais velho tinha o dobro da idade do irmão mais novo.
Sendo que os irmãos tem, respectivamente, 55 e 50 anos.
*/

import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {

        int aumenta, diminui;

        for (aumenta = 1, diminui = 5; aumenta <= 3; aumenta++, diminui--) {

            if (aumenta == diminui) {
                break;
            }

        }

        JOptionPane.showMessageDialog(null, "A Mediana é: "+aumenta);

    }
}
