
import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random randomNumbers = new Random();

        
        System.out.println("Por favor ingrese el rango en el que desea jugar, ejemplo (1, 500):");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 > num2){

            int temporalNum = num2;
            num2 = num1;
            num1 = temporalNum;
        }

        
        int randomNumberInRange = randomNumbers.nextInt(num2 - num1 + 1) + num1;

        comprobacion(randomNumberInRange,scanner, intentos);

        scanner.close();
    }

    static int intentos = 0;

    public static void comprobacion( int randomNumberInRange, Scanner scanner, int intentos){
        
            try {
                System.out.println("Ingresa un numero:");
                int numeroIntento = scanner.nextInt();
                intentos ++;
                

                if(numeroIntento == randomNumberInRange){
                    System.out.println("HAZ GANADO!!! El numero era:" + randomNumberInRange + "y lo haz logrado en" + intentos+ "intentos");
                }

                else if (numeroIntento < randomNumberInRange){
                    System.out.println("Ingresa un numero mayor:");
                    comprobacion(randomNumberInRange,scanner, intentos);
                    
                }

                else{
                    System.out.println("Ingresa un numero menor:");
                    comprobacion(randomNumberInRange,scanner, intentos);
                    

                }
            } catch (Exception e) {
                    System.out.println("ERROR!!! Ingresa un numero valido:");
                    comprobacion(randomNumberInRange,scanner, intentos);
                    
            }


    }
                

}
