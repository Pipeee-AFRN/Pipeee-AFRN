public class PasoxValor {
    
    public static void main(String[] args) {
        

        int numero = 2;
        System.out.println("Numero antes del metodo" + numero);
        pasoxValor(numero);
        System.out.println("Numero despues del metodo" + numero);
    }

    public static int pasoxValor(int numero) {
        numero = numero * 2;
        return numero;
    }
}
