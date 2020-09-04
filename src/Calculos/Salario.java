/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculos;

/**
 *
 * @author Rikelme
 */
public class Salario {
    public static void main(String[] args){
        double salario = 2750;
        double tributo = salario * 0.1; //tributo de 10%
        
        double impostoRenda = salario - tributo;
        
        System.out.println("O imposto de renda bruto é: R$ " + impostoRenda);
    }
}
