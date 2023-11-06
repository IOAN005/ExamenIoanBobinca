package com.corenetworks.modelo;

public class ProductoPerecedero extends Producto{
    //Atributos
    private String fCaducidad;
    //Metodos

    @Override
    public String toString() {
        return "ProductoPerecedero{" +
                "fCaducidad='" + fCaducidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", pvp=" + pvp +
                '}';
    }
    //constructores


    public ProductoPerecedero() {
    }

    public ProductoPerecedero(String nombre, int cantidad, double pvp, String fCaducidad) {
        super(nombre, cantidad, pvp);
        this.fCaducidad = fCaducidad;
    }
    //setters y getters

    public String getfCaducidad() {
        return fCaducidad;
    }

    public void setfCaducidad(String fCaducidad) {
        this.fCaducidad = fCaducidad;
    }

}
