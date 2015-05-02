/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdrTijdensLes1;
import javax.swing.*;


public class DEV012 {
    
    public static void main(String[] args) {
        
       int a = 1;
        int b = a;
        a = 2;
        System.out.println("hier moet je naar kijken" +b);
        
        
        
        
      //opdracht 1 
//       {
//       System.out.println("H      H      I");
//       System.out.println("H      H       ");
//       System.out.println("H      H      I");
//       System.out.println("HHHHHHHH      I");
//       System.out.println("H      H      I");
//       System.out.println("H      H      I");
//       System.out.println("H      H      I");
//       System.out.println("H      H      I");
//       }
       //opdracht 2
        {
        String naam = JOptionPane.showInputDialog("Wat is je naam?");
        
        for(int i = 0; i < naam.length()+4; i++){
            System.out.print("*");
        }
       
        //System.out.print("****");
        System.out.println();
      
    
        System.out.println("* "+ naam +" *");
        
        for(int i = 0; i < naam.length()+4; i++){
             System.out.print("*");
        }
        //System.out.print("****");
        System.out.println();
        }
        
        //opdracht 3
        
        
        
    }
}


