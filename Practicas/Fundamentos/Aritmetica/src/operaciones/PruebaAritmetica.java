package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {

        //Variable locales
        var a = 10;
        var b = 2;
        miMetodo();
        Aritmetica aritmetica = new Aritmetica();
        System.out.println("Aritmetica1 a: " + aritmetica.a);
        System.out.println("Aritmetica1 b: " + aritmetica.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("Aritmetica2 a: " + aritmetica2.a);
        System.out.println("Aritmetica2 b: " + aritmetica2.b);
    }

    public static void miMetodo() {
        //a = 10;
        System.out.println("Otro metodo");
    }

}
