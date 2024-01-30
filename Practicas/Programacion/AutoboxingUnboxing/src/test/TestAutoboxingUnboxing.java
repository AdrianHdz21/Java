package test;

public class TestAutoboxingUnboxing {

    public static void main(String[] args) {
        //Clases envolventes tipo primitivo
        /*int-Integer
        long-Long
        float-Float
        double-Double
        Boolean-Boolean
        byte-Byte
        char-Character
        short-Short
        */
        Integer entero = 10; //Autoboxing
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.doubleValue());

        int entero2 = entero;//Unboxing
        System.out.println("entero2 = " + entero2);
    }

}
