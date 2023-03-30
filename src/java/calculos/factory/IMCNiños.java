/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos.factory;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class IMCNiños extends RIMC{

   double IMC_RANGOS[][] = {
        // de 2 a 5 anios
        {15, 18, 20},
        // de 5 a 10 anios 
        {14, 18, 21},
        // de 10 a 15 anios
        {13, 19, 23},
        // de 15 a 20
        {13, 20, 25}
    };

    public IMCNiños() {
        super();
    }

    

    @Override
    public double[][] getRangos(){
        return IMC_RANGOS;
    }
}
