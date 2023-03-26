/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos;

import java.util.Date;
import model.TipoActividad;
import model.Usuario;
import calculos.strategy.CaloriasRequeridas;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public abstract class IndicadoresSalud {

    Date fecha;
    private Usuario usuario;
    
    public IndicadoresSalud(){
        this.fecha = new Date();
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
