/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos.strategy;

import calculos.IndicadorCaloriasReq;
import calculos.strategy.CaloriasRequeridas;
import calculos.IndicadoresSalud;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class MetodoCS implements CaloriasRequeridas{

    /*
    @return caloriasRequeridas
    */
    @Override
    public double calculo_kc(IndicadorCaloriasReq IS) {
        double peso = IS.getUsuario().getPeso(); 
        return peso * 35 + .2;
    }
    
}
