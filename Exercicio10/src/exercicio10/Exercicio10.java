/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
        System.out.println("Quantos pés serão convertidos? ");
    int n1 = Integer.parseInt(Teclado.next());
        
    int n2 = n1 * 12;
    System.out.println("Esse valor em Polegadas: " + n2);
        
    float n3 = (float) n1 / 3;
    System.out.println("Esse valor em Jardas: " + n3);
    
    float n4 = (float) n1 / 5280;
    System.out.println("Esse valor em milhas: " + n4);
        
    }
    
}
