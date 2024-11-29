import java.util.*;

public class ElementosPares {
    public static void main(String[] args) {
        // Ejemplo 1
        String[] array1 = {"A", "B", "A", "C", "C", "C", "C"};
        System.out.println(elementosPares(array1));

        // Ejemplo 2
        Integer[] array2 = {1, 2, 3, 1, 2, 3};
        System.out.println(elementosPares(array2));
    }

    public static <T> List<T> elementosPares(T[] array) {
        List<T> resultado = new ArrayList<>();
        List<T> revisados = new ArrayList<>();


        for (T elemento : array) {
            if (!revisados.contains(elemento)) {
                revisados.add(elemento);
                int contador = 0;
                for (T e : array) {
                    if (e.equals(elemento)) {
                        contador++;
                    }
                }
                if (contador % 2 == 0) {
                    resultado.add(elemento);
                }
            }
        }
        return resultado;
    }

}