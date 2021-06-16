/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpaz.comparenumber;

/**
 *
 * @author carla
 */
public class MainCompareNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=1, b=2, c=3;
       
         CompareNumbers n= new CompareNumbers();
         System.out.println("El mayor es el número : ");
        System.out.println(n.max(a,b,c));
        System.out.println("\n\n");
    }
    
}
