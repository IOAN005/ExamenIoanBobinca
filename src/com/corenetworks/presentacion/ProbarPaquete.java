package com.corenetworks.presentacion;

import com.corenetworks.modelo.Paquete;
import com.corenetworks.modelo.Servidor;

import java.util.Scanner;

public class ProbarPaquete {
    public static void main(String[] args) {
        Paquete p1 = new Paquete("192.222.1.0", "168.4.5.6", "si la vida se acaba manana todo esto es en vano", 0);
        System.out.println("La direction ipDestino es -> " + p1.getIpDestino());
        System.out.println("La direction ipOrigen es ->" + p1.getIpOrigen());
        System.out.println(p1.getMesaje());


        String mensaje;
        String[] paquete = new String[0];

        Scanner teclado = new Scanner(System.in);
        System.out.println("escriba el mensaje");

        mensaje = teclado.nextLine();

        if (mensaje.length() % 20 == 0) {
            paquete = new String[mensaje.length() / 20];

        } else {
            paquete = new String[mensaje.length() / 20 + 1];

        }
        for (int i = 0; i < paquete.length; i++) {

            int contadorPaquetes = i * 20;
            System.out.println(contadorPaquetes);
            if (mensaje.length() % 20 != 0 && i == paquete.length - 1) {

                paquete[i] = mensaje.substring(contadorPaquetes);
                break;

            }

            paquete[i] = mensaje.substring(contadorPaquetes, contadorPaquetes + 20);

            System.out.println(paquete[i]);

        }
        Servidor s1=new Servidor();


    }

}