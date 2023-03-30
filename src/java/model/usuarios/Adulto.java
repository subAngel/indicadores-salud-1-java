/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.usuarios;

import calculos.factory.IMCAdultos;
import calculos.factory.RIMC;
import model.Usuario;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class Adulto  extends Usuario{
    private String situacion;
//    private 
    public Adulto(){
        super();
    }

    @Override
    public RIMC getRangoIMC() {
        return new IMCAdultos();
    }
    
    public void setSituacion(){
        RIMC rango = getRangoIMC();
        rango.setSituacion(this.imc(), this.getEdad());
        this.situacion = rango.getSituacion();
    }
    
    public String getSituacion(){
        return this.situacion;
    }
    
    
}
