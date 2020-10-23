/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_jorgezuniga;

/**
 *
 * @author Alejandro
 */
public class detectives {
    private String nombre, nacionalidad;
    private int edad, añosLaborales, nivel;
    public detectives() {
    }

    public detectives(String nombre, String nacionalidad, int edad, int añosLaborales, int nivel) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.añosLaborales = añosLaborales;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public int getAñosLaborales() {
        return añosLaborales;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAñosLaborales(int añosLaborales) {
        this.añosLaborales = añosLaborales;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    @Override
    public String toString(){
        return "Nombre:"+nombre+"  Edad:"+edad+"  Nacionalidad:"+nacionalidad+"  Años laborales:"+añosLaborales+"  Nivel:"+nivel;
    }
    

}
