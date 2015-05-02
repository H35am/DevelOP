/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infOpdr_2;

public class Chip {

    private int nummer;
    private String type;

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//• public void printChip(); print alle gegevens van de chip op het
//scherm.
    public void printChip() {
        System.out.printf("Artikel nummer is %d en type is %s", nummer, type);

    }

}
