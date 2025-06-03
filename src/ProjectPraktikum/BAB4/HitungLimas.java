/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectPraktikum.BAB4;

/**
 *
 * @author MyBook Hype AMD
 */
public class HitungLimas {

    private double Luasalas; //modifier private
    public double tinggi; //modifier public
    double volume; //modifier default

    public void setAlas(double alas) {
        this.Luasalas = alas;
    }

    public double getAlas() {
        return Luasalas;
    }

    double volumeLimas() {
        return volume;
    }

    double Luas() { //hak akses default (tidak ada modifier)
        Luasalas = (getAlas() * tinggi) / 3;
        return Luasalas;
    }
}
