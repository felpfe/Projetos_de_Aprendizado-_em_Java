/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
    System.out.print("Qual o salário do funcionário? ");
    int n1 = Integer.parseInt(Teclado.nextLine());
    float N2 = (float) ((n1 + (n1 * 0.05)));
    System.out.println("O salário  após acréscimo de 5% é: " + N2);
    float n3 = (float)(N2 - (N2 * 0.07));
        System.out.println("O salário final após desconto de 7% é: " + n3);
    
    }
    
}
