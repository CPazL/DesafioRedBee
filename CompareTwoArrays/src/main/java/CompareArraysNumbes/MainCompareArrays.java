/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompareArraysNumbes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carla
 */
public class MainCompareArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        List <Integer> max = new ArrayList();
        List <Integer> a = new ArrayList();
        List <Integer> b = new ArrayList();
        a.add(1);
        a.add(8);
        a.add(3);
        a.add(4);
        
        b.add(7);
        b.add(2);
        b.add(9);
        b.add(4);
        
        max=CompareArrayNumbers.max(a,b);
        
         for (Integer i: max){
             System.out.println(i);
             System.out.println("\n");
             
         }
        
    
}
}
