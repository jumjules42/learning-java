public class PruebaCaja {
    public static void main(String args[]) {
        Caja box1 = new Caja();
        
        Caja box2 = new Caja(3, 2, 6);
        
        int volumenBox2 = box2.calcularVolumen();
        
        System.out.println("Volumen = " + volumenBox2);
    }
}
