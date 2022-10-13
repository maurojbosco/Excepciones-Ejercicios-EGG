package entidad;

import java.util.Arrays;

public class Array {
    
    //Atributo
    public int[] array = new int[10];

    //Constructores
    public Array(int[] array) {
        this.array = array;
    }

    public Array() {
    }

    //Gtters y Setters
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    //To String
    @Override
    public String toString() {
        return "Array [array=" + Arrays.toString(array) + "]";
    }
    
}
