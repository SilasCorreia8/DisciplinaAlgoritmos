package correia.silas.algoritmos.aula7;

/*
Para os aplicativos abaixos faça: Portugol, teste e código java.

b)Construa um aplicativo para calcular descontos de impostostos de renda de acordo com o senguinte:
    a)Desconto de 7.5% para salários entre 2300 e 5000.
    b)Desconto de 9% para salários entre 5000 e 7000.
    c)Desconto de 11% para salários entre 7000 e 9000.
    d)Desconto de 14% para os demais valores.

Portugol:

var
    salario, salarioR:Real
Inicio
    Leia(salario)

    se (salario >= 2300 e salario < 5000) {
        salarioR <- salario - (salario * 0.075)
        Escreval("O salario: "+salario+" com um reajuste de 7.5% é: "+salarioR)
    }
    senao se (salario >= 5000 e salario < 7000) {
        salarioR <- salario - (salario * 0.09)
        Escreval("O salario: "+salario+" com um reajuste de 9% é: "+salarioR)
    }
    senao se (salario >= 7000 e salario <= 9000) {
        salarioR <- salario - (salario * 0.11)
        Escreval("O salario: "+salario+" com um reajuste de 11% é: "+salarioR)
    }
    senao {
        salarioR <- salario - (salario * 0.14)
        Escreval("O salario: "+salario+" com um reajuste de 14% é: "+salarioR)
    }
Fim
*/


import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {

        double salario, salarioR;

        String stSalario;

        stSalario = JOptionPane.showInputDialog(null, "Digite o salario:");

        salario = Double.parseDouble(stSalario);


        if (salario < 2300) {
            JOptionPane.showMessageDialog(null, "O salario: R$"+salario+" não houve desconto");
        }
        else if (salario >= 2300 & salario < 5000) {
            salarioR = salario - (salario * 0.075);
            JOptionPane.showMessageDialog(null, "O salario: R$"+salario+" com um desconto de 7.5% é: R$"+salarioR);
        }
        else if (salario >= 5000 & salario < 7000) {
            salarioR = salario - (salario * 0.09);
            JOptionPane.showMessageDialog(null, "O salario: R$"+salario+" com um desconto de 9% é: R$"+salarioR);
        }
        else if (salario >= 7000 & salario <= 9000) {
            salarioR = salario - (salario * 0.11);
            JOptionPane.showMessageDialog(null, "O salario: R$"+salario+" com um desconto de 11% é: R$"+salarioR);
        }
        else {
            salarioR = salario - (salario * 0.14);
            JOptionPane.showMessageDialog(null, "O salario: R$"+salario+" com um desconto de 14% é: R$"+salarioR);
        }

    }
}
