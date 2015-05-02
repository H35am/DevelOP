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
//inheritance wordt hier toegepast
public class RaceAuto extends Auto {
    private int aantalSponsers;
    private String soortBrandstof;
    
    public void setAantalSponsers(int aantalSponsers){
        this.aantalSponsers = aantalSponsers;
    }
    
    public int getAantalSponsers(){
        return aantalSponsers;
    }
    
    public void setSoortBrandstof(String soortBrandstof){
        this.soortBrandstof = soortBrandstof;
    }
    
    public String getSoortBrandstof(){
        return soortBrandstof;
    }
    
    @Override
    public void print(){
        
        System.out.println(String.format("Race auto heeft %s sponer(s).", aantalSponsers));
        System.out.println(String.format("Race auto heeft %s als brandstof.", soortBrandstof));
        super.print();
        
    }
}
