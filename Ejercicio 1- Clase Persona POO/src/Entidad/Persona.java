package Entidad;

public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    // Constructores
    public Persona() {

    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método que calcula si la persona está en su peso ideal

    public int calcularIMC() {
        double IMC = this.peso / (this.altura * this.altura);
        if (IMC < 20) {
            return -1;
        } else if (IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    // Método que indica si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }
}