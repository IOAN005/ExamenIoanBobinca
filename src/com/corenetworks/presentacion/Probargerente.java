package com.corenetworks.presentacion;

import com.corenetworks.modelo.Gerente;
public class Probargerente {
    public static void main(String[] args) {
        Gerente g1=new Gerente("pepe",2000,"1");
        Gerente g2=new Gerente();
        System.out.println("calcualar ->" + g1.calcularNomina());

    }
}
