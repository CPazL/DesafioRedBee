/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpaz.sumnumbers ;

/**
 *
 * @author carla
 */
public class MainSumTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum;
        SumTwoNumbers n = new SumTwoNumbers();
        
        sum= n.sum(1,2);
        System.out.println(sum);
        
        sum= n.sum(2,2);
        System.out.println(sum);
        
        sum= n.sum(-1,5);
        System.out.println(sum);
        
        sum= n.sum(9,1554);
        System.out.println(sum);
        
        sum= n.sum(-1,-2);
        System.out.println(sum);
    }
    
}
