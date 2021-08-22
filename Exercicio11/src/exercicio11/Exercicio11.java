/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio11;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
        System.out.println("Qual o ano de nascimento? ");
    int n1 = Integer.parseInt(Teclado.next());
        System.out.println("Qual ano estamos? ");
    int n2 = Integer.parseInt(Teclado.next());
    int n3 = n2 - n1;
    System.out.println("Essa pessoa tem " + n3 + " anos");
    int n4 = n3 * 365;
        System.out.println("A idade dessa pessoa em dias é: " + n4);
    int n5 = n3 * 52;
        System.out.println("A idade dessa pessoa em semanas é: " + n5);
    }
    
}
