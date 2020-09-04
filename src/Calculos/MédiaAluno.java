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
public class MédiaAluno {
    public static void main(String[] args){
        float nota1 = 4;
        float nota2 = 7;
        float nota3 = 2;
        float nota4 = 5;
        
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        if(media >= 5){
            System.out.println("A média geral do aluno é: " + media + " Está aprovado!");
        } else{
            System.out.println("A média geral do aluno é: " + media + " Está reprovado!!");
        }
    }
}
