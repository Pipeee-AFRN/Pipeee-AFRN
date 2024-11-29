import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Palindromo {

    public static boolean puedeFormarPalindromo(int numero) {
        String numeroStr = String.valueOf(numero);

        Map<Character, Integer> conteo = new HashMap<>();
        for (char digito : numeroStr.toCharArray()) {
            conteo.put(digito, conteo.getOrDefault(digito, 0) + 1);
        }

        int impares = 0;
        for (int valor : conteo.values()) {
            if (valor % 2 != 0) {
                impares++;
            }
        }
        return impares <= 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();
        System.out.println(puedeFormarPalindromo(numero));
        // Ejemplos de prueba
        System.out.println(puedeFormarPalindromo(5));        // true
        System.out.println(puedeFormarPalindromo(2121));     // true
        System.out.println(puedeFormarPalindromo(1331));     // true
        System.out.println(puedeFormarPalindromo(3357665));  // true
        System.out.println(puedeFormarPalindromo(1294));     // false
    }
}
