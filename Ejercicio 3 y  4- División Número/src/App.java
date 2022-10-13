import java.util.InputMismatchException;
import java.util.Scanner;

import entidad.DivisionNumero;

/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
una división con los dos numeros y mostrar el resultado.
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede 
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena 
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un 
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones 
utilizando bloques try/catch para las distintas excepciones */

public class App {
    private static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Ingrese el primer número");
            int numero1 = Integer.parseInt(sn.nextLine());
            System.out.println("Ingrese el segundo número");
            int numero2 = Integer.parseInt(sn.nextLine());
            DivisionNumero division = new DivisionNumero(numero1, numero2);
            System.out.println("El resultado de la división es: " + division.dividir());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage() + "Se ingresó un dato no válido");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + " No se puede dividir por 0");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " Se le solicitó un número entero, el dato ingresado no es válido");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Ocurrió un error inesperado");
        }
    }

}
