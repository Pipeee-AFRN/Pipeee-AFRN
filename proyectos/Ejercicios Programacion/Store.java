import java.util.Scanner;
public class Store {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int PRICE_1 = 15;
        final int PRICE_2 = 10;
        final int PRICE_3 = 5;
        // Use int[] instead of String[]
        int[] prices = new int[3];
        prices[0] = PRICE_1;
        prices[1] = PRICE_2;
        prices[2] = PRICE_3;


        // Use int[] instead of String[]
        int[] cantidades = new int[3];
        for(int i = 0; i < prices.length; i++) {
            System.out.println("Enter the quantity of item " + (i+1) + ": ");
            cantidades[i] = scanner.nextInt();
        }	
            

        // calcula el total de ventas multiplicando el array de cantidades 
        //por el array de precio por la cantidad
        int totalSales = 0;
        for (int i = 0; i < prices.length; i++) {
            totalSales += prices[i] * cantidades[i];
        }

        // Print the total cost
        System.out.println("The total cost is: $" + totalSales);

        if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }

        scanner.close();
    }
}