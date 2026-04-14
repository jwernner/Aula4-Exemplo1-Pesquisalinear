/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula4.exemplo1.pesquisalinear;

import javax.swing.JOptionPane;

/**
 *
 * @author jwern
 */
public class Aula4Exemplo1Pesquisalinear {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        int i, flag;
        int numElementos = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o número de pessoas a ser cadastrado")
        );

        String vetorPesquisado[] = new String[numElementos];

        for (i = 0; i < numElementos; i++) {
            vetorPesquisado[i] = JOptionPane.showInputDialog("Digite o nome para cadastro");
        }

        String elementoProcurado = JOptionPane.showInputDialog("Digite o nome a ser procurado");
        flag = 0;

        for (i = 0; i < numElementos; i++) {
            if (vetorPesquisado[i].equalsIgnoreCase(elementoProcurado)) {
                JOptionPane.showMessageDialog(null, "O valor procurado foi encontrado na posição " + i);
                flag = 1;
            }
        }

        if (flag == 0) {
            JOptionPane.showMessageDialog(null, "O nome não foi encontrado.");
        }
    }
}
