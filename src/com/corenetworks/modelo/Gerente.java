package com.corenetworks.modelo;

public class Gerente extends Empleado{
    private String departameno;



    public double calcularNomina(){
        return super.calcularNomina()+500;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departameno='" + departameno + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    public Gerente() {
    }


    public Gerente(String nombre, double sueldo, String departameno) {
        super(nombre, sueldo);
        this.departameno = departameno;
    }
}
