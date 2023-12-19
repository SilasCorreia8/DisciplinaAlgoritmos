package correia.silas.algoritmos.exercicio_livro1_10;

/*
6. Ler o sexo de uma pessoa ("M" ou "F") e exibir a mensagem "Masculino" ou "Feminino". Assuma somente entradas validas.

Portugol:

var
    sexo: Caractere
Inicio
    Leia(sexo)
    se (sexo == "M" ou sexo == "m") entao {
        Escreval("Masculino)
    }

    senao {
        se (sexo == "F" ou sexo == "f") entao {
            Escreval("Feminino")
        }

        senao {
            Escreval(Informação Invalida)
        }
    }
Fim
*/

import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {

        String sexo;

        sexo=JOptionPane.showInputDialog(null, "Fale o seu sexo:");


        if (sexo.equalsIgnoreCase("M")) {
            JOptionPane.showMessageDialog(null, "Masculino");
        }

        else {
            if (sexo.equalsIgnoreCase("F")) {
                JOptionPane.showMessageDialog(null, "Feminino");
            }

            else {
                JOptionPane.showMessageDialog(null, "Informação invalida");
            }
        }

    }
}