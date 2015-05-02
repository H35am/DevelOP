/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infOpdr_3;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author 0775768 <Hesam.Zarza>
 */
public class Fiets extends Vervoersmiddel{
    private int versnellingen;
    private String merk;
    
    public void setVersnellingen(int versnellingen){
        this.versnellingen = versnellingen;
    }
    
    public int getVersnellingen(){
        return versnellingen;
    }
    
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    
    public String getMerk(){
        return merk;
    }
    @Override
    public void print(){
        System.out.println(String.format("Het merk van deze fiets is: %s", merk));
        System.out.println(String.format("Deze fiets heeft %s versnellingen.", versnellingen));
        super.print();
        
    }
    
}
