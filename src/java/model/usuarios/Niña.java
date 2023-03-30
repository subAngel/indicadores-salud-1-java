/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.usuarios;

import calculos.factory.IMCNiñas;
import calculos.factory.RIMC;
import model.Usuario;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class Niña extends Usuario {

    public String situacion;

    public Niña() {
        super();
    }

    @Override
    public RIMC getRangoIMC() {
        return new IMCNiñas();
    }

    @Override
    public void setSituacion() {
        RIMC rangos = getRangoIMC();
        rangos.setSituacion(this.imc(), this.getEdad());
        this.situacion = rangos.getSituacion();
    }
    
    @Override
    public String getSituacion(){
        return this.situacion;
    }
}
