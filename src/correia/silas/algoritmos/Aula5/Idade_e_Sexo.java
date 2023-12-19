package correia.silas.algoritmos.Aula5;

import javax.swing.JOptionPane;

public class Idade_e_Sexo {
    public static void main(String[] args) {

        int idade;
        String sexo, stIdade;

        stIdade=JOptionPane.showInputDialog(null, "Digite a Idade:");
        sexo=JOptionPane.showInputDialog(null, "Fale o seu sexo:");

        idade=Integer.parseInt(stIdade);

        if (idade >= 18) {
            if (sexo.equals("m")) {
                JOptionPane.showMessageDialog(null, "Masculino");
            }
        }

        else {
            JOptionPane.showMessageDialog(null, "Menor de Idade");
        }
    }
}
