/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;
/**
 *
 * @author Liliana Lozano
 */
public class Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de filas: ");
        int Filas=sc.nextInt();
        sc.close();
        
        System.out.println();
        for(int alto=1; alto<filas; alto++){
            System.out.print("  ");
        }
        for(int asterisco=1; asterisco<=(alto*2)-1; asterisco++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
