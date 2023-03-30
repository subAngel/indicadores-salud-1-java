/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import calculos.factory.RIMC;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Angel Jesus Zorrilla Cuevas
 */
public abstract class Usuario {

    private String nombre;
    private String username;
    private char sexo;
    private Date fechaNacimiento;
    private String password;
    private Integer idUser;
    private int edad;
    private double estatura;
    private double peso;
    private RIMC rangosIMC;
    
    public Usuario() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(Date fecha) {
        Calendar fechaNacimiento = Calendar.getInstance();
        //Se crea un objeto con la fecha actual
        Calendar fechaActual = Calendar.getInstance();
        //Se asigna la fecha recibida a la fecha de nacimiento.
        fechaNacimiento.setTime(fecha);
        //Se restan la fecha actual y la fecha de nacimiento
        int año = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        int mes = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
        int dia = fechaActual.get(Calendar.DATE) - fechaNacimiento.get(Calendar.DATE);
        //Se ajusta el año dependiendo el mes y el día
        if (mes < 0 || (mes == 0 && dia < 0)) {
            año--;
        }
        //Regresa la edad en base a la fecha de nacimiento
        this.edad = año;
    }
    
    public void setEstatura(double estatura){
        this.estatura = estatura;
    }
    public double getEstatura(){
        return this.estatura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return this.peso;
    }
//    public void setSituacion(){
//        this.situacion = "";
//    }
//    public String getSituacion(){
//        return this.situacion;
//    }
    // IMC
    public double imc(){
        return this.peso / Math.pow(this.estatura/100, 2);
    } 
    // * abstract methods
    public abstract RIMC getRangoIMC();
    public abstract String getSituacion();
}
