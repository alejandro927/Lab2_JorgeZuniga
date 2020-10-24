/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_jorgezuniga;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class casos {
    
    ArrayList op = new ArrayList();
    
    private String lugar, descripcion, tipo1, estado;
    public casos(){
        
    }

    public casos(String lugar, String descripcion, String tipo1, String estado) {
        
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.tipo1 = tipo1;
        this.estado = estado;
    }



    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLugar() {
        return lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo1() {
        return tipo1;
    }

    public String getEstado() {
        return estado;
    }
    
    @Override
    public String toString(){
        return "Lugar:"+lugar+"  Descripcion:"+descripcion+"  Tipo:"+tipo1+"  Detective a cargo:  "+"  Estado:"+estado;
    }
    
    
}
