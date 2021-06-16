/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpaz.sumnumbersarrays;

import java.util.List;

/**
 *
 * @author carla
 */
public class SumArraysNumber {

        public void SumArraysNumber(){
            
        }
    /**
     *
     * @param array
     * @return
     */
  public static Integer sum(List <Integer> array) {
          Integer suma=0 ;
                
            for(int i=0; i<array.size();i++){
                suma= suma+ array.get(i); 
            }
        return suma;
        }
  }


