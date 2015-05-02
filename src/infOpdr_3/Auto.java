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
public class Auto extends Vervoersmiddel {

    private int deuren;
    private String merk;

    public void setDeuren(int deuren) {
        this.deuren = deuren;
    }

    public int getDeuren() {
        return deuren;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    @Override
    public void print(){
        
        System.out.println(String.format("Merk van de auto is %s" ,merk));
        System.out.println(String.format("Deze auto heeft %s deuren." ,deuren));
        //hier wordt print method van bovenliggende class 
        super.print();
        
    }

    
}
