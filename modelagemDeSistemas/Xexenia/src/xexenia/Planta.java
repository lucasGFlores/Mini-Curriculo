/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xexenia;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas_g_flores
 */
public class Planta {
    private String especie, alturaMedia;
    private boolean temFruta;

    public Planta(String especie, String alturaMedia, boolean temFruta) {
        this.especie = especie;
        this.alturaMedia = alturaMedia;
        this.temFruta = temFruta;
    }
    public void fotoSintee(){
        JOptionPane.showMessageDialog(null,"Luz do Sooool");
    }
}

