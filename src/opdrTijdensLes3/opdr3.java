/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdrTijdensLes3;
import java.util.ArrayList;
//import java.util.Scanner;
import javax.swing.JOptionPane;
        
/**
 *
 * @author Djam
 */
public class opdr3 {
    public static void main(String[] args){

//        //methode 1
//        String name = null;
//        while (name == null || name.equals("stop")){
//            //vraag naam;
//            // sla naam op;   
//        }
//        
        
        ArrayList<String> namen = new ArrayList<String>(); 
        //methode 2
        while(true){
            String naam = JOptionPane.showInputDialog("Wat is je naam?");
            if("stop".equals(naam)){
                break;
            }
            namen.add(naam);
        }
        String grootste = null;
        for (String n : namen){
            System.out.println(n);
            if (grootste == null){
                grootste = n;
            }else{
                if (grootste.length() < n.length()){
                    grootste = n;
                }
            }
        }
       
       System.out.println(namen);
    }
    
    
}
