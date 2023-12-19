package correia.silas.algoritmos.aula4;

/*
var
    delta, raizDelta, a, b, c, raiz1, raiz2:Real
Inicio
    Leia(a)
    Leia(b)
    Leia(c)

    delta <- b*b - 4*a*c
    raizDelta <- Raizq(delta)

    raiz1 <- (-b + raizDelta) / (2*a)
    raiz2 <- (-b - raizDelta) / (2*a)

    Escreval(delta)
    Escreval(raiz1)
    Escreval(raiz2)
Fim
*/


import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio6 {
    public static void main(String[] args) {

        double delta, raizDelta, a, b, c, raiz1, raiz2;

        String stA, stB, stC;

        stA = JOptionPane.showInputDialog(null, "Digite o Valor A:");
        stB = JOptionPane.showInputDialog(null, "Digite o Valor B:");
        stC = JOptionPane.showInputDialog(null, "Digite o Valor C:");

        a = Double.parseDouble(stA);
        b = Double.parseDouble(stB);
        c = Double.parseDouble(stC);

        DecimalFormat corte = new DecimalFormat("0.00");

        delta = b*b - 4*a*c;
        raizDelta = Math.sqrt(delta);

        raiz1 = (-b + raizDelta) / (2*a);
        raiz2 = (-b - raizDelta) / (2*a);

        JOptionPane.showMessageDialog(null,"O Delta é: "+corte.format(delta)+"\nO Resultado x1 é: "+corte.format(raiz1)+"\nO Resultado x2 é: "+corte.format(raiz2));

    }
}
