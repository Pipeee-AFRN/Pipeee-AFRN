import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        //se crea la instancia Scanner para leer los datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Constantes que representan las tasas de impuesto y el umbral de impuesto
        final double TAX_RATE_HIGH = 0.15;  
        final double TAX_RATE_LOW = 0.10;   
        final double TAX_THRESHOLD = 50;    

        // Arreglo para almacenar las tasas de impuestos y el umbral
        Double[] TASAS_IMPUESTO = new Double[3]; 

        // Asignación de las constantes al arreglo
        TASAS_IMPUESTO[0] = TAX_RATE_HIGH; 
        TASAS_IMPUESTO[1] = TAX_RATE_LOW;   
        TASAS_IMPUESTO[2] = TAX_THRESHOLD;  

        // asigación de constantes para  calcular
        // el impuesto dependiendo del valor de los productos

        final double MAX_PRICE = 1000;
        final double MIN_PRICE = 50;


        // Se pide al usuario que ingrese la cuantos productos quiere ingresar
        System.out.println("Cuantos productos deseas ingresar?");
        int numberOfProducts = scanner.nextInt();

        double[] productPrices = new double[numberOfProducts];

        for(int i = 0; i < numberOfProducts; i++){
            System.out.println("Ingrese el precio del producto " + (i + 1) + ":");
            productPrices[i] = scanner.nextInt();
        }
        double totalTax = 0;
        for(int i = 0; i < numberOfProducts; i++){
            double tax = 0;
            // Se calcula el impuesto para el producto que tenga un valor mayor o igual a $1000
            if(productPrices[i] >= MAX_PRICE){
                tax = productPrices[i] * TASAS_IMPUESTO[0];
                System.out.println("El impuesto del producto" + (i + 1) + "es: " + tax);
            }
            // Se calcula el impuesto para el producto que tenga un valor menor a $1000 y mayor a $50
            else if(productPrices[i] < MAX_PRICE && productPrices[i] >= MIN_PRICE){
                tax = productPrices[i] * TASAS_IMPUESTO[1];
                System.out.println("El impuesto del producto" + (i + 1) + "es: " + tax);
            }
            
            totalTax += tax;
        }

        if (totalTax >TASAS_IMPUESTO[2]) {
            System.out.println("El impuesto total es: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    scanner.close();
    }
}
