public class EjemploNumMayor{

    public static void main(String[] args) {

    
        int numeroMayor = numMayor(2,20,3);
        System.out.println("El número mayor es: " + numeroMayor);

    }
    public static int numMayor(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}