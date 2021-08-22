/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio12;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Qual o preço de fábrica do produto? ");
        int n1 = Integer.parseInt(Teclado.next());
        int n2 = (int) (n1 * 0.5);
        System.out.println("O lucro do distribuidor é: " + n2);
        int n3 = (int) (n1 * 0.3);
        System.out.println("O valor correspondente aos impostos é: " + n3);
    int n4 = n1 + n2 + n3;
        System.out.println("O valor total do produto é: " + n4);
    }
    
}
