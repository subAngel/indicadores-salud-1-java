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
public class Niño extends Usuario {
//    private String situacion;

    public Niño() {
        super();
    }

    @Override
    public RIMC getRangoIMC() {
        return new IMCNiños();
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
