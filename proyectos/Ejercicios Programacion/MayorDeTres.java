
import java.util.Scanner;

public class MayorDeTres {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tres numeros:");

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();


        if((numero1 > numero2) && (numero1 > numero3)){
            System.out.println("El numero mayor es: " + numero1);
        }

        else if ((numero2 > numero3) && (numero2 > numero1)){
            System.out.println("El numero mayor es: " + numero2);
        }

        else{
            System.out.println("El numero mayor es: " + numero3);
        }
        scanner.close();
    }
}
