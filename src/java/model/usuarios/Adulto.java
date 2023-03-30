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
public class Adulto extends Usuario {
//    private String situacion;
//    private 

    public Adulto() {
        super();
    }

    @Override
    public RIMC getRangoIMC() {
        return new IMCAdultos();
    }


    @Override
   public String getSituacion() {
        if (imc() >= 18.5 && imc() <= 24.9) {
            return "PESO NORMAL";
        } else if (imc() >= 25.0 && imc() <= 29.9) {
            return "SOBREPESO";
        } else if (imc() >= 30.0 && imc() <= 34.9) {
            return "OBESIDAD GRADO I";
        } else if (imc() >= 35.0 && imc() <= 39.9) {
            return "OBESIDAD GRADO II";
        } else if (imc() >= 40) {
            return "OBESIDAD GRADO III";
        } else {
            return "BAJO DE PESO";
        }
    }

}
