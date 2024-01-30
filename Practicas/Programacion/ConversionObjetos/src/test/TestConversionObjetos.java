package test;

import domain.*;

public class TestConversionObjetos {

    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        
       // System.out.println("empleado = " + empleado.obtenerDetalles());
        //Downcasting
        //((Escritor)empleado).getTipoEsctritura();
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEsctritura();
        //Upcasting
        Empleado empleado2 = escritor;
        empleado.obtenerDetalles();
        System.out.println("empleado2 = " + empleado2.obtenerDetalles());
    }

}
