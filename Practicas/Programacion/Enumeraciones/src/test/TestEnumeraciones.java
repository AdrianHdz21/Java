package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {

    public static void main(String[] args) {
//        System.out.println("Dia 1: " + Dias.LUNES); 
//        IndicarDiaSemana(Dias.MARTES);
        System.out.println("Continente numero 4: " + Continentes.AMERICA);
        System.out.println("No. Paises en el 4to continente: " + Continentes.AMERICA.getPaises());
        System.out.println("Continente numero 1: " + Continentes.AFRICA);
        System.out.println("No. Paises en el 1er continente: " + Continentes.AFRICA.getPaises());
    }

    private static void IndicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
        }
    }

}
