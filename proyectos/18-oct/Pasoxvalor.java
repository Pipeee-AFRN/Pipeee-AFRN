public class Pasoxvalor {
    
    public static void intercambiar(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Paso por valor:" + "a="+ a +"b="+b);
    }
    public static void main(String[] args){

        int a = 5;
        int b = 1;
        System.out.println("Valores originales:" + "a="+ a +"b="+ b);
        intercambiar(a, b);
        System.out.println("Valores despues de llamar al metodo intercambiar:" + "a = "+ a +"b = "+ b);
    }
}
 
