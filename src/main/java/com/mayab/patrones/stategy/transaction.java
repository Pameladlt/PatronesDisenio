
package com.mayab.patrones.stategy;

public class transaction {
    
    String fecha;
    String categoria;
    String comercio;
    float  cantidad;
   
    
    public transaction(String f, String c, float can, String ca){
        this.fecha=f;
        this.cantidad=can;
        this.categoria=ca;
        this.comercio=c;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getComercio() {
        return comercio;
    }

    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}

