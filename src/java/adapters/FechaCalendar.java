/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapters;

import java.util.Calendar;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class FechaCalendar implements Fecha{
    private Calendar calendar;
    public FechaCalendar(Calendar calendar){
        this.calendar = calendar;
    }

    @Override
    public int getAnio() {
        return calendar.get(Calendar.YEAR);
    }

    @Override
    public int getMes() {
        return calendar.get(Calendar.MONTH+1);
    }

    @Override
    public int getDia() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public int getHora() {
        return calendar.get(Calendar.HOUR);
    }

    @Override
    public int getMinuto() {
        return calendar.get(Calendar.MINUTE);
    }
    
}
