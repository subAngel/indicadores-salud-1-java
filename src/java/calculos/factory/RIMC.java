/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos.factory;

/**
 * Esta es la clase producto
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public abstract class RIMC {
    double[] rangos;
    String situacion;
    
    public abstract String getSituacion();
    public abstract void setSituacion(double imc, int edad);
    
    public void setRangos(double[] rangos){
        this.rangos = rangos;
    }
    public double[] getRangos(){
        return this.rangos;
    }
}
