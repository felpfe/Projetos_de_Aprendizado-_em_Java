/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("digite o dividendo: ");
        int N1 = Integer.parseInt(Teclado.nextLine());
        System.out.println("digite o divisor: ");
        int N2 = Integer.parseInt(Teclado.nextLine());
        int res = N1 / N2;
        System.out.println("o resultado é: ");
        System.out.println(res);
    }
    
}
