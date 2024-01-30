package caja;

public class Caja {

    //Atributos
    int ancho;
    int alto;
    int profundo;

    public Caja() {
        System.out.println("Constructor vacio");
    }

    public Caja(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public void calculoVolumen() {
        int volumen = this.alto * this.ancho * this.profundo;
        System.out.println("volumen = " + volumen);
    }

}
