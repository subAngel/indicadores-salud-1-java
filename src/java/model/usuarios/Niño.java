/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.usuarios;

import calculos.factory.IMCNiños;
import calculos.factory.RIMC;
import model.Usuario;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class Niño extends Usuario{
    private String situacion;
    public Niño(){
        super();
    }

    @Override
    public RIMC getRangoIMC() {
        return new IMCNiños();
    }
    
    public void setSituacion(){
        this.getRangoIMC().setSituacion(this.imc(), this.getEdad());
        this.situacion = this.getRangoIMC().getSituacion();
    }
    
    public String getSituacion(){
        return this.situacion;
    }
}
