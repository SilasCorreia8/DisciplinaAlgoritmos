package correia.silas.algoritmos.Aula5;

/*
var
    idade:Inteiro
    sexo:Caractere
Inicio
    Leia(idade)
    leia(sexo)
    Se (idade >= 18 e idade <=120 ){
        Se (sexo = "m") {
            Escreval("Maior de Idade e Masculino")
        } senao {
            Escreval("Maior de Idade e Feminino")
        }
    }

    Se (idade > 0 & idade <18 ){
        Se (sexo = "m") {
            Escreval("Menor de Idade e Masculino")
        } senao {
            Escreval("Menor de Idade e Feminino")
        }
    }
Fim

Teste

Idade    Sexo   Saida
18        M      Maior de Idade e Masculino
10        M      Menor de Idade e Masculino
20        F      Maior de Idade e Feminino
10        F      Menor de Idade e Feminino

*/

import javax.swing.JOptionPane;

public class Exercicio1_Idade {
    public static void main(String[] args) {

        int idade;
        String sexo, stIdade;

        stIdade=JOptionPane.showInputDialog(null, "Informe a sua Idade:");
        sexo=JOptionPane.showInputDialog(null, "Informe o seu sexo:");

        idade=Integer.parseInt(stIdade);

        if (idade >= 18 & idade <= 120) {
            if (sexo.equals("m")) {
                JOptionPane.showMessageDialog(null, "Maior de Idade e Masculino");
            } else {
                JOptionPane.showMessageDialog(null, "Maior de Idade e Feminino");
            }
        }

        if (idade > 0 & idade < 18) {
            if (sexo.equals("m")) {
                JOptionPane.showMessageDialog(null, "Menor de Idade e Masculino");
            } else {
                JOptionPane.showMessageDialog(null, "Menor de Idade e Feminino");
            }
        }
    }
}
