package com.corenetworks.modelo;

public class Paquete {
    //1.Atributos
    private String ipOrigen;
    private String ipDestino;
    private String mensaje;
    private String contadorPaquetes;
    //2Constructores

    public Paquete() {
    }

    public Paquete(String ipOrigen, String ipDestino, String mensaje, String contadorPaquetes) {
        this.ipOrigen = ipOrigen;
        this.ipDestino = ipDestino;
        this.mensaje = mensaje;
        this.contadorPaquetes = contadorPaquetes;
    }
    //3.Setters y Getters


    public String getIpOrigen() {
        return ipOrigen;
    }

    public void setIpOrigen(String ipOrigen) {
        this.ipOrigen = ipOrigen;
    }

    public String getIpDestino() {
        return ipDestino;
    }

    public void setIpDestino(String ipDestino) {
        this.ipDestino = ipDestino;
    }

    public String getMesaje() {
        return mensaje;
    }

    public void setMesaje(String mesaje) {
        this.mensaje = mensaje;
    }

    public String getContadorPaquetes() {
        return contadorPaquetes;
    }

    public void setContadorPaquetes(String contadorPaquetes) {
        this.contadorPaquetes = contadorPaquetes;
    }
}
