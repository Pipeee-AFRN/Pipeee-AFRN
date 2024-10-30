import java.util.Random;
import java.util.Scanner;

public class JuegoDeCarreras {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Opciones de autos
        String[] autos = {"Auto 1", "Auto 2", "Auto 3", "Auto 4", "Auto 5"};
        
        // Elegir auto del jugador
        System.out.println("Elige un auto (0-4):");
        for (int i = 0; i < autos.length; i++) {
            System.out.println(i + ": " + autos[i]);
        }
        
        int eleccionJugador = scanner.nextInt();
        String autoJugador = autos[eleccionJugador];

        // Elección aleatoria del auto de la computadora
        int eleccionComputadora = random.nextInt(autos.length);
        String autoComputadora = autos[eleccionComputadora];

        System.out.println("Has elegido: " + autoJugador);
        System.out.println("La computadora ha elegido: " + autoComputadora);
        
        // Variables para la distancia
        int meta = 50; // Distancia a la meta
        int distanciaJugador = 0;
        int distanciaComputadora = 0;

        // Carrera
        while (distanciaJugador < meta && distanciaComputadora < meta) {
            // Avance del jugador
            distanciaJugador += random.nextInt(5) + 1; // Avanza de 1 a 5
            // Avance de la computadora
            distanciaComputadora += random.nextInt(5) + 1; // Avanza de 1 a 5

            // Mostrar posiciones
            System.out.println(autoJugador + " ha avanzado a: " + distanciaJugador);
            System.out.println(autoComputadora + " ha avanzado a: " + distanciaComputadora);
            System.out.println("-------------------------");

            // Pausa para visualizar el avance
            try {
                Thread.sleep(1000); // Espera 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Determinar el ganador
        if (distanciaJugador >= meta && distanciaComputadora >= meta) {
            System.out.println("¡Es un empate!");
        } else if (distanciaJugador >= meta) {
            System.out.println(autoJugador + " ha ganado!");
        } else {
            System.out.println(autoComputadora + " ha ganado!");
        }

        scanner.close();
    }
}
