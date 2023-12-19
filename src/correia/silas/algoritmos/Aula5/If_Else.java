package correia.silas.algoritmos.Aula5;

//var
//    n1,n2:Inteiro
//Inicio
//    Leia(n1)
//    Leia(n2)
//    Se(n1>=n2) {
//        Escreval("Verdadeiro")
//    }
//    senao {
//        Escreval("Falso")
//    }
//    Fimse
//Fim

import javax.swing.JOptionPane;

public class If_Else {
    public static void main(String[] args) {

        int n1, n2;

        String stN1, stN2;

        stN1 = JOptionPane.showInputDialog(null, "Digite o primeiro valor:");
        stN2 = JOptionPane.showInputDialog(null, "Digite o segundo valor:");

        n1 = Integer.parseInt(stN1);
        n2 = Integer.parseInt(stN2);

        if (n1>=n2) {
            JOptionPane.showMessageDialog(null, "O primeiro valor é maior que o segundo");
        }
        else {
                JOptionPane.showMessageDialog(null, "O primeiro valor é menor que o segundo");
        }
    }
}
