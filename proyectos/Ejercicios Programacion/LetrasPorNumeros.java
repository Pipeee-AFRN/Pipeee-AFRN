import java.text.Normalizer;
import java.util.Scanner;

public class LetrasPorNumeros {
    public static String reemplazarPorIndices(String texto) {
        // Limpiar el texto: eliminar espacios, acentos y caracteres especiales
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD)
                          .replaceAll("[^a-zA-Z]", "") // Solo mantener letras
                          .toLowerCase(); // Convertir a minúsculas para uniformidad

        StringBuilder resultado = new StringBuilder();

        // Reemplazar cada letra por su índice en el alfabeto
        for (char c : texto.toCharArray()) {
            int index = c - 'a' + 1; // Calcular índice (A=1, B=2, ..., Z=26)
            resultado.append(index).append(" ");
        }

        // Retornar el string resultante sin el último espacio
        return resultado.toString().trim();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el texto: ");
        String texto = scanner.nextLine();

        System.out.println(reemplazarPorIndices(texto));

        // Ejemplo
        String textoEjemplo  = "abc def";
        System.out.println(reemplazarPorIndices(textoEjemplo)); // Salida: "1 2 3 4 5 6"

        scanner.close();
    }
}
