/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapters;

import java.util.Date;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class FechaDate implements Fecha{
    private Date date;
    public FechaDate(Date date){
        this.date = date;
    }

    @Override
    public int getAnio() {
        return date.getYear()+1900;
    }

    @Override
    public int getMes() {
        return date.getMonth();
    }

    @Override
    public int getDia() {
        return date.getDate();
    }

    @Override
    public int getHora() {
        return date.getHours();
    }

    @Override
    public int getMinuto() {
        return date.getMinutes();
    }
    
}
