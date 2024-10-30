
class Rectangulo{
    int ancho;
    int alto;
    Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}
public class Pasoxreferencia {

    public static void modificarRectangulo(Rectangulo rect){
        rect.ancho = 5;
        rect.alto = 10;
        System.out.println("Rectangulo paso por referencia: " + rect.ancho + " " + rect.alto);
    }
    public static void main(String[] args) {
        System.out.println("");
        Rectangulo miRectangulo = new Rectangulo(1, 5);
        System.out.println("Rectangulo original: " + miRectangulo.ancho + " " + miRectangulo.alto);
        modificarRectangulo(miRectangulo);
        System.out.println("Rectangulo final: " + miRectangulo.ancho + " " + miRectangulo.alto);
    }
    

}

