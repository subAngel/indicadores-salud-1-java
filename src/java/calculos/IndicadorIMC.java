/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos;


/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class IndicadorIMC extends IndicadoresSalud{
    private double estatura, peso, imc;
    private String situacion;
    
    public IndicadorIMC(){
        super();
    }
    
//    public double getIMC(){
//        return this.getPeso() / Math.pow(this.getEstatura()/100, 2);
//    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setIMC(double imc){
        this.imc = imc;
    }
    public double getIMC(){
        return this.imc;
    }
    public void setSituacion(String situacion){
        this.situacion = situacion;
    }
    public String getSituacion(){
        return this.situacion;
    }
    
    
}
