/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio13;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner Teclado = new Scanner(System.in);
        System.out.println("Qual o valor do salário minímo? ");
      int n1 = Integer.parseInt(Teclado.next());
        System.out.println("Qual o número de horas trabalhadas: ");
        int n2 = Integer.parseInt(Teclado.next());
      int n3 = (int) ((n1 * 0.1) * n2);
        System.out.println("O salário bruto é: " + n3);
        int n4 = (int) (n3 - (n3 * 0.3));
        System.out.println("O salário liquido é: " + n4);
    }
    
}
