/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapters;

import java.time.LocalDateTime;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class FechaLocalDateTime implements Fecha{

    private LocalDateTime ldt;
    public FechaLocalDateTime(LocalDateTime ldt){
        this.ldt = ldt;
    }
    @Override
    public int getAnio() {
        return ldt.getYear();
    }

    @Override
    public int getMes() {
        return ldt.getMonthValue();
    }

    @Override
    public int getDia() {
        return ldt.getDayOfMonth();
    }

    @Override
    public int getHora() {
        return ldt.getHour();
    }

    @Override
    public int getMinuto() {
        return ldt.getMinute();
    }
    
}
