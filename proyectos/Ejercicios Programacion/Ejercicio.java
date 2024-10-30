import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int contador = 0;



        for(int i = 0; i <= numeros.length; i++ ){
            
            System.out.println("Ingrese un numero: ");
            numeros[i] = scanner.nextInt();
            contador += numeros[i];
            double promedio = contador/(double)numeros[i];
            System.out.println(promedio);
        }

        scanner.close();

    }
}
