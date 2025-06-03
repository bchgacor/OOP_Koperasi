/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectPraktikum.BAB3;

/**
 *
 * @author MyBook Hype AMD
 */
public abstract class Segitiga {
    public double alas,tinggi,luas;
    public double Luas(){
        luas = 0.5*(alas *tinggi);
        return luas;
    }  
    abstract double Volume();
}