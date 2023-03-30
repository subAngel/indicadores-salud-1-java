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

//    public String situacion;

    public Niña() {
        super();
    }

    @Override
    public RIMC getRangoIMC() {
        return new IMCNiñas();
    }

    @Override
     public String getSituacion() {
        int indiceEdad = this.getEdad() < 5 ? 0 : this.getEdad() < 10 ? 1 : this.getEdad() < 15 ? 2 : 3;
        double [] rangos = getRangoIMC().getRangos()[indiceEdad];
        if (this.imc() < rangos[0]) {
            return "BAJO PESO";
        } else if (imc() < rangos[1]) {
            return "PESO NORMAL";
        } else if (imc() < rangos[2]) {
            return "SOBREPESO";
        } else {
            return "OBESIDAD";
        }

    }
   
}
