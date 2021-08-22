/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
        System.out.println("Qual a base do triângulo? ");
    int n1 = Integer.parseInt(Teclado.next());
        System.out.println("Qual a altura do triângulo? ");
    int n2 = Integer.parseInt(Teclado.next());
    int n3 = (n1 * n2) / 2;
        System.out.println("A área total do triângulo é: " + n3);
    }
    
}
