/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class IndicadorICC extends IndicadoresSalud {

    private int cadera, cintura;
    private double icc;
    private String riesgo;

    public IndicadorICC() {
        super();
    }

    public double getICC() {
        return (double) this.cintura/(double) this.cadera;
    }

    public void setRiesgo() {
        char sexo = this.getUsuario().getSexo();
        if (sexo == 'M') {
            if (this.getICC() < 0.80) {
                this.riesgo = "Bajo";
            }
            if (this.getICC() > 0.81 && this.getICC() < 0.85) {
                this.riesgo = "Moderado";
            }
            if (this.getICC() > 0.86) {
                this.riesgo = "Alto";
            }
        } else {
            if (this.getICC() < 0.95) {
                this.riesgo = "Bajo";
            }
            if (this.getICC() > 0.96 && this.getICC() < 1.0) {
                this.riesgo = "Moderado";
            }
            if(this.getICC() > 1.0){
                this.riesgo = "Alto";
            }
        }
    }
    public String getRiesgo(){
        return this.riesgo;
    }

    public int getCadera() {
        return cadera;
    }

    public void setCadera(int cadera) {
        this.cadera = cadera;
    }

    public int getCintura() {
        return cintura;
    }

    public void setCintura(int cintura) {
        this.cintura = cintura;
    }

}
