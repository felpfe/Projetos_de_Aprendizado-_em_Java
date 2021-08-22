/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio14;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
        System.out.println("Qual o valor do salário mínimo?");
    int n1 = Integer.parseInt(Teclado.next());
        System.out.println("Qual a quantidade de Kilowatts gasta?");
        int n2 = Integer.parseInt(Teclado.next());
    int n3 =  (int) ( n1 * 0.2);
        System.out.println("O valor de cada Kilowatt é: " + n3);
    int n4 = (int) (n3 * n2);
    System.out.println("O valor a ser pago por será: " + n4);
    int n5 = (int) (n4 - (n4 * 0.15));
    System.out.println("O valor a ser pago com desconto de 15% será: " + n5);
    }
    
}
