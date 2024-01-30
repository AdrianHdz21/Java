package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable=10;
        //miVariable=5;
        System.out.println("miVariable = " + miVariable);
        
        //Persona.MI_CONSTANTE=5;    
        System.out.println("Mi constante:" +Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1 = " + persona1.getNombre());
    }  
}
