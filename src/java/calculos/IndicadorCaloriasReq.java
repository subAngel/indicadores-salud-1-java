/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos;

import calculos.strategy.CaloriasRequeridas;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class IndicadorCaloriasReq extends IndicadoresSalud{
    private int factorActividad;
//    private double peso, estatura;
    private double caloriasRequeridas;
    private CaloriasRequeridas strategyCalorias;
    
    public IndicadorCaloriasReq(){
        super();
    }

    public int getFactorActividad() {
        return this.factorActividad;
    }

    public void setFactorActividad(int factorActividad) {
        this.factorActividad = factorActividad;
    }

    public void setStrategyCalorias(CaloriasRequeridas strategyCalorias) {
        this.strategyCalorias = strategyCalorias;
    }

    public double getCaloriasRequeridas() {
        return this.caloriasRequeridas;
    }

    public void setCaloriasRequeridas(CaloriasRequeridas strategy) {
        this.caloriasRequeridas = strategy.calculo_kc(this);
    }
    
   
    
}
