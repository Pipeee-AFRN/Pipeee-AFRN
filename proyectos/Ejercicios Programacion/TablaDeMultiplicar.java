
import java.util.Scanner;




public class TablaDeMultiplicar {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = scanner.nextInt();

        for(int i = 1;i <=10; i++){
            System.out.println("La tabla de multiplicar del" + " " + numero + "es:" 
            + numero +" "+ "X" +" "+ i +" " +"=" +""+ (numero*i) );

    
        }
        scanner.close();
    }

}
