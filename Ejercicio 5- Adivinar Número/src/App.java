/*Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora 
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para 
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el 
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando 
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario 
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe 
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el 
carácter fallido como un intento. */

import java.util.InputMismatchException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 499 + 1);
        int numeroIngresado = 0;
        int count = 0;
        System.out.println("¡Vamos a jugar! Adivine cual es el número");
        do {
            try {
                Scanner sn = new Scanner(System.in);
                System.out.println("Ingrese un número entre 1 y 500"); 
                numeroIngresado = sn.nextInt();
                if (numeroIngresado < numeroAleatorio) {
                    System.out.println("¡Intento fallido! El número ingresado es menor al número a adivinar");
                } else if (numeroIngresado > numeroAleatorio){
                    System.out.println("¡Intento fallido! El número ingresado es mayor al número a adivinar");
                }
            } catch (InputMismatchException e) {
                System.out.println("¡Intento fallido! El dato ingresado no es un número entero");
            } catch (Exception e) {
                System.out.println(e.toString() + " ¡Intento fallido! Ocurrió un error inesperado");
            }
            count++;

        } while (numeroIngresado != numeroAleatorio);
        System.out.println("Felicitaciones adivinó el número en el intento # " + count);
    }
}
