package paquete1;

public class TestModificadoresAcceso {
    
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Publico");
        clase1.setAtributoPrivado("Cambio desde la prueba");
        System.out.println("clase 1 atributo Privado = " + clase1.getAtributoPrivado());
    }
}
