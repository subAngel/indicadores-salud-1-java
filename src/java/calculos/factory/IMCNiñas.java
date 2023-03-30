/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos.factory;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class IMCNiñas extends RIMC {

    final double IMC_RANGOS[][] = {
        // de 2 a 5 anios
        {15, 18, 20},
        // de 5 a 10 anios 
        {14, 18, 21},
        // de 10 a 15 anios
        {13, 19, 23},
        // de 15 a 20
        {13, 20, 25}
    };

    public IMCNiñas() {
        super();
    }

    @Override
    public String getSituacion() {
        return this.situacion;
    }

    @Override
    public void setSituacion(double imc, int edad) {
        int indiceEdad = edad < 5 ? 0 : edad < 10 ? 1 : edad < 15 ? 2 : 3;
        double[] rangos = IMC_RANGOS[indiceEdad];
        if (imc < rangos[0]) {
            this.situacion = "BAJO PESO";
        } else if (imc < rangos[1]) {
            this.situacion = "PESO NORMAL";
        } else if (imc < rangos[2]) {
            this.situacion = "SOBREPESO";
        } else {
            this.situacion = "OBESIDAD";
        }
    }
}
