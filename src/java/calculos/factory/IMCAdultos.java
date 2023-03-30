/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos.factory;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class IMCAdultos extends RIMC {

    public IMCAdultos() {
        super();
    }

    @Override
    public String getSituacion() {
        return this.situacion;
    }

    @Override
    public void setSituacion(double imc, int i) {
        if (imc >= 18.5 && imc <= 24.9) {
            this.situacion = "PESO NORMAL";
        } else if (imc >= 25.0 && imc <= 29.9) {
            this.situacion = "SOBREPESO";
        } else if (imc >= 30.0 && imc <= 34.9) {
            this.situacion = "OBESIDAD GRADO I";
        } else if (imc >= 35.0 && imc <= 39.9) {
            this.situacion = "OBESIDAD GRADO II";
        } else if (imc >= 40) {
            this.situacion = "OBESIDAD GRADO III";
        } else {
            this.situacion = "BAJO DE PESO";
        }
    }

}
