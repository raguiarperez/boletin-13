/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg13;

import javax.swing.JOptionPane;

/**
 *
 * @author rafa2
 */
public class masajista extends Seleccion {
    private String titulacion;
    private int anosExperiencia;

    public masajista(String titulacion, int anosExperiencia, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    
    
    public void darMasaxes(){
        
    }
    
    public void viaxar() {
        JOptionPane.showMessageDialog(null,"Viaxan os xogadores.\n"+this);
    }

    @Override
    public String toString() {
        return super.toString()+ "\nTitulación = " + titulacion + "\nAños de experiencia = " + anosExperiencia;
    }
    
    
}
