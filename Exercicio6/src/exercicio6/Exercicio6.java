/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
        System.out.println("Qual o valor do salário base do funcionário? ");
    int N1 = Integer.parseInt(Teclado.nextLine());
        System.out.println("Qual o valor das vendas desse funcionário?");
    int N2 = Integer.parseInt(Teclado.nextLine());
    int N3 = (int)(N1 + (N2 * 0.04));
        System.out.println("O salário final após acréscimo de 4% das vendas é: " + N3);
        
    
    }
    
}
