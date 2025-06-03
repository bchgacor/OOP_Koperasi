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
public class Tabung extends Lingkaran {
    int t;
    double volume;
    public Tabung(){
        t=20;
    }
    void Keterangan(){
        Deskripsi();
        System.out.println("mengitung Volume Tabung");
    }
    double volume(){
       volume = (luas()*t);
       return volume;
    } 
}
