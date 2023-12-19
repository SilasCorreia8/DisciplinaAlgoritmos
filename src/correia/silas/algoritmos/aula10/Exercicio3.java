package correia.silas.algoritmos.aula10;

/*
1. Escreva um algoritmo que lê 5 valores e conta quantos destes são negativos.
2. A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados sobre o salario e números de filhos
a prefeitura deseja saber:
a) Medía do salario da população.
b) Média do número de filhos.
c) Percentual de pessoas com salário até R$1.300.
A aplicação termina quando o usúsario indica que não deseja continuar.
3. Bob tem 1m e 50cm e cresce 2 cm por ano, enquanto Smith tem 1m e 10cm e cresce 3 cm ao ano. Construa um algoritm que
calcule e mostre quantos anos serão nescessarios para que Smith seja maior que Bob.
*/

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {

        int anos = 0;
        double alturaBob = 1.50, alturaSmith = 1.10;

        do {

            alturaBob = alturaBob + 0.02;
            alturaSmith = alturaSmith + 0.03;
            anos++;

        } while (alturaSmith < alturaBob);

        JOptionPane.showMessageDialog(null, "Demorou "+anos+" anos para Smith ficar maior que Bob!");

    }
}
