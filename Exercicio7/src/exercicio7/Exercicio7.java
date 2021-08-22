/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
        System.out.println("a Nota 1 possui peso 5.");
        System.out.println("Qual a nota 1? ");
    int N1 = Integer.parseInt(Teclado.nextLine());
        System.out.println("A nota 2 possui peso 3.");
        System.out.println("Qual a nota 2? ");
    int N2 = Integer.parseInt(Teclado.nextLine());
        System.out.println("A nota 3 possui peso 5.");
        System.out.println("Qual a nota 3? ");
    int N3 = Integer.parseInt(Teclado.nextLine());
    int res = ((N1 * 5) + (N2 * 3) + (N3 * 5)) / 13;
        System.out.println("A média final do aluno é: " + res);
    
    }
    
}
