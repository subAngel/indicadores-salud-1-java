/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos.strategy;

import calculos.IndicadorCaloriasReq;
import calculos.strategy.CaloriasRequeridas;
import calculos.IndicadoresSalud;
import model.TipoActividad;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class MetodoBH implements CaloriasRequeridas{

    /**
     * 
     * @param IS indicadores de salud
     * @return calorrias requeridas
     */
    
    @Override
    public double calculo_kc(IndicadorCaloriasReq IS) {
        TipoActividad actividad = new TipoActividad();
        char sexo = IS.getUsuario().getSexo();
        double BMR = IS.getPeso() * 24;
        if(sexo == 'M')
            return BMR * 0.9 * actividad.getFactor(sexo, IS.getFactorActividad()); ;
//            return BMR * 0.9 * IS.get
        return BMR * actividad.getFactor(sexo, IS.getFactorActividad());
    }
    
}
