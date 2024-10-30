
class Auto{

    String modelo;

    Auto(String modelo){
        this.modelo = modelo;
    }
}

public class PasoxReferencia2 {
    
    public static void main(String[] args) {
        Auto coche = new Auto("BMW");
        System.out.println("Modelo original: " + coche.modelo);
        cambiarModelo(coche);
        System.out.println("Modelo después del método: " + coche.modelo);
    }

    public static void cambiarModelo(Auto a) {
        a.modelo = "Audi";
    }
}
