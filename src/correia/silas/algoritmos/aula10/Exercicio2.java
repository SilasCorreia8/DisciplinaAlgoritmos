package correia.silas.algoritmos.aula10;

/*
1. Escreva um algoritmo que lê 5 valores e conta quantos destes são negativos.
2. A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados sobre o salario e números de filhos,
a prefeitura deseja saber:
a) Medía do salario da população.
b) Média do número de filhos.
c) Percentual de pessoas com salário até R$1.300.
A aplicação termina quando o usúsario indica que não deseja continuar.
3. Bob tem 1m e 50cm e cresce 2 cm por ano, enquanto Smith tem 1m e 10cm e cresce 3 cm ao ano. Construa um algoritm que
calcule e mostre quantos anos serão nescessarios para que Smith seja maior que Bob.
*/

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {

        int cont = 0, contS = 0, populacao, filhos, somaFilhos = 0;
        double salario, mSalario = 0, mFilhos = 0, somaSalario = 0, percSalario = 0;

        String stPopulacao, stFilhos, stSalario, resposta = "sim";

        //stPopulacao = JOptionPane.showInputDialog(null, "Qual numero da população:");

        //populacao = Integer.parseInt(stPopulacao);

        while (resposta.equalsIgnoreCase("sim")) {

            //Contador

            cont++;

            //Calculo Salario

            stSalario = JOptionPane.showInputDialog(null, "Digite o Salário:");

            salario = Double.parseDouble(stSalario);

            somaSalario = somaSalario + salario;
            mSalario = somaSalario / cont;

            //Calculo Filhos

            stFilhos = JOptionPane.showInputDialog(null, "Quantidade de Filhos:");

            filhos = Integer.parseInt(stFilhos);

            somaFilhos = somaFilhos + filhos;
            mFilhos = somaFilhos / cont;

            //Calculo percentual de pessoas com o salário até R$1.300

            if (salario >= 0 && salario >= 1.300) {

                contS++;

                percSalario = (contS/cont) * 100;

            }

            resposta = JOptionPane.showInputDialog(null, "Deseja continuar:");
        }

        JOptionPane.showMessageDialog(null, "A média de salário é: "+mSalario+
                "\nA média de filhos é: "+mFilhos+
                "\nO percentual de pessoas com o salário de até R$1.300 é: "+percSalario);

    }
}
