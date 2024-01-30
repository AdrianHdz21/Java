
import java.util.Scanner;

public class Variables {

    public static void main(String args[]) {
        //Tipos Primitivos enteros:  byte,short,int,long;
        /*byte numeroByte = (byte) 129;
        System.out.println("Valor byte:" + numeroByte);
        System.out.println("Valor minimo del byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte:" + Byte.MAX_VALUE);
        System.out.println("\n");
        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo del short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo del short:" + Short.MAX_VALUE);
        System.out.println("\n");
        int numeroint = (int) 2147483648L;
        System.out.println("numeroInt = " + numeroint);
        System.out.println("Valor minimo del int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo del int:" + Integer.MAX_VALUE);
        System.out.println("\n");
        long numeroLong =9223372036854775807L;
        System.out.println("numerolong = " + numeroLong);
        System.out.println("Valor minimo del long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo del long:" + Long.MAX_VALUE);
        System.out.println("\n");

        //Tipos Primitivos flotante:  float,double
        /*float numeroFloat = (float)3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo del float:" + Float.MIN_VALUE);
        System.out.println("Valor maximo del float:" + Float.MAX_VALUE);
        System.out.println("\n");
        double numeroDouble=10;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo del Double:" + Double.MIN_VALUE);
        System.out.println("Valor maximo del Double:" + Double.MAX_VALUE);
        System.out.println("\n");*/
 /*var numeroEntero=10;
        System.out.println("numeroEntero = " + numeroEntero);
        var numeroDouble=10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        var numeroFloat=10.0F;
        System.out.println("numeroFloat = " + numeroFloat);*/
 /*var miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        var vChar1 = '\u0021';
        System.out.println("vChar = " + vChar1);
        var varCharDecimal2=33;
        System.out.println("varCharDecimal = " + varCharDecimal2);
        var varCharSimbolo3 = "!";
        System.out.println("varCharSimbolo = " + varCharSimbolo3);
        
        int variableEntera = '!';
        System.out.println("variableEntera = " + variableEntera);
        int letra = 'a';
        System.out.println("letra = " + letra);
        int letra2= 'A';
        System.out.println("letra2 = " + letra2);*/
 /*//Uso Boolean
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        if (varBoolean == true) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }
        var edad = 20;
        //var esAdulto = edad >= 18;
        if(edad>=18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }*/
        //Conversiones de String a Int
//        var edad = Integer.parseInt("20");
//        //var edad="20";
//        System.out.println("edad = " + (edad + 1));
//        var valorPI = Double.parseDouble("3.1416");
//        System.out.println("valorPI = " + valorPI);
//
////        //Pedir un valor
//        var consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad:");
//        edad=Integer.parseInt(consola.nextLine());
//        System.out.println("edad10 = " + edad);

//        var edadTexto = String.valueOf(10);
//        System.out.println("edadTexto = " + edadTexto);
//        var caracter = "hola".charAt(1);
//        System.out.println("caracter = " + caracter);
//        System.out.println("Proporciona un caracter");
//        caracter = consola.nextLine().charAt(0);
//        System.out.println("caracter = " + caracter);
        String nombre = "";
        int id = 0;
        double precio = 0.00;
        boolean envioGratuito = false;

        var consola = new Scanner(System.in);
        System.out.println("Proporcione el nombre:");
        nombre = consola.nextLine();
        System.out.println("Proporcione el id:");
        id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporcione el precio:");
        precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporcione el envio gratuito");
        envioGratuito = Boolean.parseBoolean(consola.nextLine());
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratutio: " + envioGratuito);

    }

}
