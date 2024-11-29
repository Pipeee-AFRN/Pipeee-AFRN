import java.util.Scanner; 

public class AgeValidation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        int age = scanner.nextInt();

        
        final int AGE_LIMIT = 18;
        
        if (age >= AGE_LIMIT) {
            System.out.println("Access granted");
        }
        
        else {
            System.out.println("Access denied");
        }

        scanner.close();
    }
}