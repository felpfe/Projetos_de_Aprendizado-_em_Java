/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
        System.out.println("Qual o valor do lado do quadrado ? ");
    int n1 = Integer.parseInt(Teclado.next());
    int n2 = (int) Math.pow(n1,2);
        System.out.println("A área total do quadrado é: " + n2);
        
    
    }
    
}
