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
public class adestrador extends Seleccion {
    private String idFederacion;

    public adestrador(String idFederacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    
    
    public void dirixirPartido(){
        
    }
    public void dirixirAdestramento(){
        
    }
    
    public void viaxar() {
        JOptionPane.showMessageDialog(null,"Viaxan os xogadores.\n"+this);
    }

    @Override
    public String toString() {
        return super.toString()+ "\nID Federación = " + idFederacion;
    }
    
    
}
    
   
