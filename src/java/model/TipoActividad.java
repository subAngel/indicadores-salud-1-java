/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class TipoActividad implements Serializable{
    private Integer idTAc;
    private final String[] DESCRIPCION = {
        "No realizan practicamente ejercicio", 
        "realizan ejercicios suaves de 1 a 3 veces por semana",
        "Practican deporte de 3 a 5 veces por semana",
        "Practican deporte de 6 a 7 dias por semana"
    };
    private final String[] ACTIVIDADES = {"SEDENTARIO", "LIGERAMENTE ACTIVAS", "MODERADAMENTE ACTIVAS", "MUY ACTIVAS"};
    private final double[] FACTOR_MUJER = {1.0, 1.12, 1.27, 1.45};
    private final double[] FACTOR_HOMBRE = {1.0, 1.11, 1.25, 1.48};
        
    public TipoActividad(){
        
    }

    public String[] getActividades(){
        return this.ACTIVIDADES;
    }
    public String getDescripcion(int numActividad){
        return this.DESCRIPCION[numActividad];
    }
    public double getFactor(char sexo, int numActividad){
        if(sexo=='M')
            return this.FACTOR_MUJER[numActividad];
        return this.FACTOR_HOMBRE[numActividad];
    }
}
