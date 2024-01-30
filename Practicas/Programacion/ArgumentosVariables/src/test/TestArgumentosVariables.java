package test;

public class TestArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        variosParametros("Juan", "Pedro", "Maria");
    }

    private static void variosParametros(String... nombre) {
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Nombre = " + nombre[i]);
        }
    }

    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + numeros[i]);
        }
    }

}
