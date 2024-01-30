package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
//        System.out.println("persona1 = " + persona1.getNombre());
//        System.out.println("persona1 = " + persona1.getSueldo());
//        System.out.println("persona1 = " + persona1.isEliminado());
        System.out.println("persona1 = " + persona1);
        persona1.setNombre("Juan Carlos");
        persona1.setSueldo(7500.00);
        persona1.setEliminado(true);
//        System.out.println("persona1 con cambio = " + persona1.getNombre());
//        System.out.println("persona1 con cambio = " + persona1.getSueldo());
//        System.out.println("persona1 con cambio = " + persona1.isEliminado());
        System.out.println("persona1 = " + persona1);

    }

}
