/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpaz.comparenumber;

public class CompareNumbers {
        int a, b, c;
    public void CompareNumbers(){

        }
   public int max(int a, int b, int c){
            this.a=a;
            this.b=b;
            this.c=c;
        
        if(a>=b){
            if(a>=c){
                return a;
            }else{
                return c;}
        }else{
             if(b>=c){
                return b;
            }else{
                return c;}
        }
    }
   
    public void SetA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    public void setC(int c){
        this.c=c;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
    
}
