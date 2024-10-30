public class CicloRepetitivo {
    public static void main(String[] args){


        //Ciclo while

        int i = 0;
        while(i < 5){
            System.out.println("Iteración " + i);
            i++;
        }

        //do while
        int j = 0;
        do{
            System.out.println("Iteración " + j);
            j++;
        }while(j < 5);

        //optimizacion de ciclos

        //mala practica
        int[] arr1 = {1,2,3,4,5};
        for(int a = 0; a < arr1.length; a++){
            //el calculo arr.length se repite innecesariamente en cada iteracion
        }

        //buena practica

        int[] arr = {1,2,3,4,5};  //declaracion y inicialización de arreglo
        int n = arr.length;
        for(int k = 0; k < n; k++){
            //el calculo arr.length se realiza una vez al principio del ciclo
        }
    }
}