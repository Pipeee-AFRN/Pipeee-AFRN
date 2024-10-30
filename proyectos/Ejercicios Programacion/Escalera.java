import java.util.Scanner;

public class Escalera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese el número de filas: ");
        int numeroFilas = scanner.nextInt();

        int numero = 1;
        int fila = 1;

        while(fila <= numeroFilas) {
            int columna = 1;

            while(columna <= fila) {
                 // Se usa print para imprimir numero en la mima linea
                System.out.print(numero + " ");
                numero += 1;
                columna += 1;
            }
            // Salto de línea después de cada fila
            System.out.println(); 
            fila += 1;
        }

        scanner.close();
    }
}
