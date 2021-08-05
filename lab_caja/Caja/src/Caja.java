public class Caja {
    int alto;
    int ancho;
    int profundo;
    
    public Caja() {
        System.out.println("Se creo un objeto de tipo Caja con constructor vacio.");
    }
    
    public Caja(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    
    public int calcularVolumen() {
        return this.alto * this.ancho * this.profundo;
    }
}