package com.corenetworks.modelo;

public class Servidor {

    //1.Atributos
    private String ip;

    //2.Metodo
    public String leerPaquete(Paquete[] paquetes) {
        String variable="";
        for (Paquete elemento:paquetes){
            variable +=elemento.getMesaje();
        }

return variable;

    }
    public boolean verificarPaquetes(Paquete[] paquetes){
        return paquetes.length==paquetes[1].getContadorPaquetes();
    }


    }

