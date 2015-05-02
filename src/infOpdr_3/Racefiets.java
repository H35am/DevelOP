/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infOpdr_3;

/**
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class Racefiets extends Fiets {
    
    private String sponsor;
    private String soortFrame;
    
    public void setSponsor(String sponsor){
        this.sponsor = sponsor;
    }
    
    public String getSponsor(){
        return sponsor;
    }
    
    public void setSoortFrame(String soortFrame){
        this.soortFrame = soortFrame;
    }
    
    public String getSoortFrame(){
        return soortFrame;
    }
    
    @Override
    public void print(){
        System.out.println(String.format("De sponsor team is: %s", sponsor));
        System.out.println(String.format("Deze fiets heeft %s frame.", soortFrame));
        super.print();
    }
    
}
