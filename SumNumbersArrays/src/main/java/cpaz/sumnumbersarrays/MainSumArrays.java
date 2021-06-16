/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpaz.sumnumbersarrays;

import java.util.ArrayList;
import java.util.List;

public class MainSumArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Integer suma ;
       
        List <Integer> vec = new ArrayList();
     
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        
        
        
        suma=SumArraysNumber.sum(vec);
        System.out.println(suma);

        
    
}

}
