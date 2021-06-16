/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompareArraysNumbes;

import java.util.ArrayList;
import java.util.List;


public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    List <Integer> max = new ArrayList();

    if(a.size() >= b.size()){
      
      for(int i=0; i<a.size();i++){
            if(a.get(i)>b.get(i)){
              
              max.add(a.get(i));
            }
            else{
                max.add(b.get(i));
            }
           
      }
      
     return max;
    }
    else{
        for(int i=0; i<b.size();i++){
          
            if(a.get(i)>b.get(i)){
              
              max.add(a.get(i));
            }
            else{
                max.add(b.get(i));
            }
           
      }
      
    return max;
    }
    
    }

}

