package correia.silas.algoritmos.aula4;

/*
var
    a11, a12, a13, b21, b22, b23, c31, c32, c33:Real
Inicio
    Leia(a11)
    Leia(a12)
    Leia(a13)
    Leia(b21)
    Leia(b22)
    Leia(b23)

    c31 <- a11 + b21;
    c32 <- a12 + b22;
    c33 <- a13 + b23;

    Escreval("O resultado de c31 é "c31)
    Escreval("O resultado de c32 é "c32)
    Escreval("O resultado de c33 é "c33)
Fim
*/

import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {

        double a11, a12, a13, b21, b22, b23, c31, c32, c33;
        String stA11, stA12, stA13, stB21, stB22, stB23, stC31, stC32, stC33;

        stA11 = JOptionPane.showInputDialog(null, "Digite o valor de a11:");
        stA12 = JOptionPane.showInputDialog(null, "Digite o valor de a12:");
        stA13 = JOptionPane.showInputDialog(null, "Digite o valor de a13:");
        stB21 = JOptionPane.showInputDialog(null, "Digite o valor de b21:");
        stB22 = JOptionPane.showInputDialog(null, "Digite o valor de b22:");
        stB23 = JOptionPane.showInputDialog(null, "Digite o valor de b23:");

        a11 = Double.parseDouble(stA11);
        a12 = Double.parseDouble(stA12);
        a13 = Double.parseDouble(stA13);
        b21 = Double.parseDouble(stB21);
        b22 = Double.parseDouble(stB22);
        b23 = Double.parseDouble(stB23);

        c31 = a11 + b21;
        c32 = a12 + b22;
        c33 = a13 + b23;

        JOptionPane.showMessageDialog(null, "Resultado:"+"\nC31: "+c31+"\nC32: "+c32+"\nC33: "+c33);

    }
}
