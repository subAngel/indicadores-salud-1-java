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
public class MetodoHB implements CaloriasRequeridas {

    @Override
    public double calculo_kc(IndicadorCaloriasReq IS) {
        TipoActividad actividad = new TipoActividad();
        char sexo = IS.getUsuario().getSexo();
        int factor = IS.getFactorActividad();
        if (sexo == 'M')
            return (655 + (9.6 * IS.getPeso()) + (1.8 * IS.getEstatura()) - (4.7 * IS.getUsuario().getEdad())) * actividad.getFactor(sexo, IS.getFactorActividad());
        return (66 + (13.7  * IS.getPeso()) + (5 * IS.getEstatura()) - (6.8*IS.getUsuario().getEdad())) * actividad.getFactor(sexo, IS.getFactorActividad());
    }

}
