package Servicio;

import java.util.Scanner;

import Entidad.Persona;

public class PersonaService {
    private Scanner sn = new Scanner(System.in);

    // Metodo que le pide los valores de los atributos al
    // usuario para llenar el objeto Persona. Además, comprueba que el sexo
    // introducido sea correcto,
    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        String nombre = sn.next();
        System.out.println("Ingrese la edad de la persona");
        int edad = sn.nextInt();
        System.out.println("Ingrese el sexo de la persona: 'H' para hombre, 'M' para mujer, 'O' para otro");
        char sexo = sn.next().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Ingrese una opción válida");
            sexo = sn.next().charAt(0);
        }
        System.out.println("Introduzca el peso de la persona");
        double peso = sn.nextDouble();
        System.out.println("Introduzca la altura de la persona");
        double altura = sn.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);

    }
}
