/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio15;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
        System.out.println("Qual temperatura será convertida?");
    int n1 = Integer.parseInt(Teclado.next());
    int n2 = (int) (((9 * n1) / 5) + 32);
        System.out.println("O valor em Fahrenheit é: " + n2);
    }
    
}
