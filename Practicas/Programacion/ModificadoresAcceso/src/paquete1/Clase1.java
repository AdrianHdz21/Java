package paquete1;

class Clase1 {

    private String atributoPrivado = "Valor atributo Privado";

    private Clase1() {
        System.out.println("Constructor Privado");
    }

    public Clase1(String arg) {
        this();
        System.out.println("Constructor Publico");
    }

    private void metodoPrivado() {
        System.out.println("Metodo Privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
}
