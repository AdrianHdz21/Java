package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 0);
        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrioun error de tipo operaacionExcepcion");
        } catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Excepcion: ");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se reviso la division entre 0");
        }
        System.out.println("resultado = " + resultado);
    }
}
