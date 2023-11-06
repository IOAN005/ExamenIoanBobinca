package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;
import com.corenetworks.modelo.ProductoPerecedero;

public class ProbarProductos {
    public static void main(String[] args) {
        ProductoPerecedero pp1=new ProductoPerecedero("leche",2,1.2,"2023/12/31");
        System.out.println(pp1.toString());
        Producto p1=new Producto("carne",3,5.5);
        Producto p2=new Producto("carne",3,5.5);
        System.out.println(p1.toString());
        System.out.println("Resultado del metodo equals  ->" + p1.equals(p2));
    }

}
