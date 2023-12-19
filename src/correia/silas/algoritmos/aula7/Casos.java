package correia.silas.algoritmos.aula7;

import javax.swing.JOptionPane;

public class Casos {
    public static void main(String[] args) {

        int opcao;

        String stOpcao;

        stOpcao = JOptionPane.showInputDialog(null, "Digite uma opção:");

        opcao = Integer.parseInt(stOpcao);

        /*
        Primeira maneira de fazer:

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Bom dia!");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Boa tarde!");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Boa noite!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Valor Invalido");
        }
        */

        /*
        Segunda maneira de fazer:

        switch (opcao) {
            case 1 -> JOptionPane.showMessageDialog(null, "Bom dia!");
            case 2 ->JOptionPane.showMessageDialog(null, "Boa tarde!");
            case 3 -> JOptionPane.showMessageDialog(null, "Boa noite!");
            default -> JOptionPane.showMessageDialog(null, "Valor Invalido");
        }
        */

        /*
        Opção utilizando If e else:
        */

        if (opcao == 1) {
            JOptionPane.showMessageDialog(null, "Bom dia!");
        }
        else if (opcao == 2) {
            JOptionPane.showMessageDialog(null, "Boa tarde!");
        }
        else if (opcao == 3) {
            JOptionPane.showMessageDialog(null, "Boa noite!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Valor Invalido");
        }

    }
}
