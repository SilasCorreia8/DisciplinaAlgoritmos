package correia.silas.algoritmos.aula7;

/*
Para os aplicativos abaixos faça: Portugol, teste e código java.

a)Construa um aplicativo que mostre os mêses do ano, sendo 1 Janeiro, e Fervereiro e assim sucessivamente.

Portugol:

var
    mes:Inteiro
Inicio
    Leia(mes)

    escolha(mes) {
        caso 1:
            Escreva("Janeiro")
            pare
        caso 2:
            Escreva("Fevereiro")
            pare
        caso 3:
            Escreva("Março")
            pare
        caso 4:
            Escreva("Abril")
            pare
        caso 5:
            Escreva("Maio")
            pare
        caso 6:
            Escreva("Junho")
            pare
        caso 7:
            Escreva("Julho")
            pare
        caso 8:
            Escreva("Agosto")
            pare
        caso 9:
            Escreva("Setembro")
            pare
        caso 10:
            Escreva("Outubro")
            pare
        caso 11:
            Escreva("Novembro")
            pare
        caso 12:
            Escreva("Dezembro")
            pare
        caso contrario:
            Escreva("Valor Invalido")
    }
Fim

Teste: mes    |    Resultado
        1     |     Janeiro
        2     |     Fevereiro
        3     |     Março
        4     |     Abril
        5     |     Maio
        6     |     Junho
        7     |     Julho
        8     |     Agosto
        9     |     Setembro
        10    |     Outubro
        11    |     Novembro
        12    |     Dezembro
*/

import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {

        int mes;

        String stMes;

        stMes = JOptionPane.showInputDialog(null, "Digite o mês");

        mes = Integer.parseInt(stMes);

        switch (mes) {
            case 1 -> JOptionPane.showMessageDialog(null, "Janeiro");
            case 2 -> JOptionPane.showMessageDialog(null, "Fevereiro");
            case 3 -> JOptionPane.showMessageDialog(null, "Março");
            case 4 -> JOptionPane.showMessageDialog(null, "Abril");
            case 5 -> JOptionPane.showMessageDialog(null, "Maio");
            case 6 -> JOptionPane.showMessageDialog(null, "Junho");
            case 7 -> JOptionPane.showMessageDialog(null, "Julho");
            case 8 -> JOptionPane.showMessageDialog(null, "Agosto");
            case 9 -> JOptionPane.showMessageDialog(null, "Setembro");
            case 10 -> JOptionPane.showMessageDialog(null, "Outubro");
            case 11-> JOptionPane.showMessageDialog(null, "Novembro");
            case 12 -> JOptionPane.showMessageDialog(null, "Dezembro");
            default -> JOptionPane.showMessageDialog(null, "Valor Invalido");
        }

    }
}
