import java.util.Scanner;

public class Radio {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el volumen del radio: ");
        double radio = scanner.nextDouble();
        double area = CalcularArea(radio);
        System.out.println("El area del circulo es:" + area);
        
    }

    public static double CalcularArea(double r){
        return Math.PI * Math.pow(r, 2);
    }
}
