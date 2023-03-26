/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos;

import calculos.strategy.CaloriasRequeridas;
import calculos.strategy.MetodoBH;
import org.eclipse.jdt.internal.compiler.ast.SuperReference;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public class IndicadorIMC extends IndicadoresSalud{
    private double estatura, peso;
    private String situacion;
    
    public IndicadorIMC(){
        super();
    }
    
    public double getIMC(){
        return this.getPeso() / Math.pow(this.getEstatura()/100, 2);
    }

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


    public String getSituacion() {
        double imc = getIMC();
        if (imc >= 18.5 && imc <= 24.9) {
            return "PESO NORMAL";
        }
        if (imc >= 25.0 && imc <= 29.9) {
            return "SOBREPESO";
        }
        if (imc >= 30.0 && imc <= 34.9) {
            return "OBESIDAD GRADO I";
        }
        if (imc >= 35.0 && imc <= 39.9) {
            return "OBESIDAD GRADO II";
        }
        if (imc >= 40) {
            return "OBESIDAD GRADO III";
        }
        return "BAJO DE PESO";
    }
    

}
