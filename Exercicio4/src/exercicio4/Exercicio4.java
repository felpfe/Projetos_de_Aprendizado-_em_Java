/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Qual o preço? ");
        int n1 = Integer.parseInt(Teclado.nextLine());
        int res = n1 - ((n1 * 10) / 100);
        System.out.println("O preço após desconto de 10% é: ");
        System.out.println(res);
        // TODO code application logic here
    }
    
}
