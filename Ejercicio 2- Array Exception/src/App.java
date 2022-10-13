/*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para 
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera 
de rango). */

import entidad.Array;

public class App {
    public static void main(String[] args) {
        Array array = new Array();
        try {
            array.array[18] = 12;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()+ " El tamaño del array excede el límite solicitado");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
    }
}
