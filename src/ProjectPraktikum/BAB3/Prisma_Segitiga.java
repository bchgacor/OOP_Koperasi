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
public class Prisma_Segitiga extends Segitiga{
    double t, vol;
    @Override
    double Volume() {
        vol = (Luas()*t);
        return vol;
    }

}