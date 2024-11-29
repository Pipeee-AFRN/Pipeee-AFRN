import java.util.Scanner;


public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa dos numeros para calcular el rango. Ejemplo (1,100):");

        int count = 0;
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();


        if(numero1 > numero2){

            int numeroTemporal = numero1;
            numero1 = numero2;
            numero2= numeroTemporal;
        }


        for(int i = numero1; i < numero2; i++){
            if(i % 2 ==0){
                count ++;
            }

        }

        System.out.println("Hay " + count + " números pares entre 1 y 100.");

        scanner.close();
    }
}
