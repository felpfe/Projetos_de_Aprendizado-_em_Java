/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("nota 1: ");
        int N1 = Integer.parseInt(Teclado.nextLine());
        System.out.println("nota 2: ");
        int N2 = Integer.parseInt(Teclado.nextLine());
        System.out.println("Nota 3: ");
        int N3 = Integer.parseInt(Teclado.nextLine());
        int res = (N1 + N2 + N3) / 3;
        System.out.print("O resultado é: " );
        System.out.println(res);
        
        // TODO code application logic here
    }

    private static int getText(Scanner teclado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
