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
public class Força {
    public static void main(String[] args) {
        double massa = 800;
        double aceleracao = 40;
        
        double forca = massa * aceleracao;
        
        System.out.println("A força do carro é: "+ forca + " N");
    }
}
