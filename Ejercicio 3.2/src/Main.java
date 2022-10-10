

public class Main {
    public static void main(String[] args) {
    Coche coche = new Coche();
    coche.sumarPuerta();
        System.out.println(coche.numeroPuertas);
    }
}
class Coche{
    int numeroPuertas = 2;

    public void sumarPuerta(){
    this.numeroPuertas ++;
    }
}