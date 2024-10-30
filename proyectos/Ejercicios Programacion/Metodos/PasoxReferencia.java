class Persona{
    String nombre;

    Persona(String nombre){
        this.nombre = nombre;
    }
}


public class PasoxReferencia {
    public static void main(String[] args) {
        
        Persona persona = new Persona("juan");
        System.out.println("valor antes del metodo" + persona.nombre);
        cambiarNombre(persona);
        System.out.println("valor despues del metodo" + persona.nombre);
    }

    public static void cambiarNombre(Persona persona){
        persona.nombre = "pedro";
    }
}
