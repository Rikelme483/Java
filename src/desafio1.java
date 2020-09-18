
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rikelme
 */
public class desafio1 {
    public static void main(String[] args) {
        int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada desejada:"));
        int ate = Integer.parseInt(JOptionPane.showInputDialog("Digite até que número vai a tabuada do " + tabuada + ":"));
        int resultado;
        
        for (int i = 0; i <= ate; i++) {
            resultado = tabuada * i;
            System.out.println(tabuada + " * " + i + " = " + resultado);
        }
       
        
    }
}
