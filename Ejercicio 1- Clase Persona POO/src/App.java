import Entidad.Persona;

/*Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el 
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula 
try-catch para probar la nueva excepción que debe ser controlada. */

public class App {
    public static void main(String[] args) {
        try {
            Persona pedro = null;
            System.out.println(pedro.esMayorDeEdad());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
