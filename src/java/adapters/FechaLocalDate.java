/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapters;

import java.time.LocalDate;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class FechaLocalDate implements Fecha{
    private LocalDate ld;
    public FechaLocalDate(LocalDate ld){
        this.ld = ld;
    }

    @Override
    public int getAnio() {
        return ld.getYear();
    }

    @Override
    public int getMes() {
        return ld.getMonthValue();
    }

    @Override
    public int getDia() {
        return ld.getDayOfMonth();
    }

    @Override
    public int getHora() {
        return 0;
    }

    @Override
    public int getMinuto() {
        return 0;
    }
    
}
