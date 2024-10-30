import java.util.Scanner;

public class MenuOperaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bucle infinito para mantener la calculadora en funcionamiento
        while (true) {
            System.out.println("Ingresa una operacion:");
            System.out.println(" 1. Suma");
            System.out.println(" 2. Resta");
            System.out.println(" 3. Multiplicacion");
            System.out.println(" 4. Division");
            System.out.println(" 5. Salir");

            int opcionUsuario = scanner.nextInt();

            if (opcionUsuario == 5) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.println("Ingresa un numero:");
            int numero1 = scanner.nextInt();

            System.out.println("Ingresa un numero:");
            int numero2 = scanner.nextInt();

            
            switch (opcionUsuario) {
                case 1:
                    System.out.println("El resultado de la Suma entre " + numero1 + " y " + numero2 + " es: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("El resultado de la Resta entre " + numero1 + " y " + numero2 + " es: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("El resultado de la Multiplicacion entre " + numero1 + " y " + numero2 + " es: " + (numero1 * numero2));
                    break;
                case 4:
                    if (numero2 != 0) {
                        System.out.println("El resultado de la Division entre " + numero1 + " y " + numero2 + " es: " + (numero1 / numero2));
                    } else {
                        System.out.println("¡ERROR! No se puede dividir por 0. Por favor, ingresa un número diferente a 0.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 5.");
                    break;
            }
        }

        scanner.close(); 
    }
}
