package entidad;

public class DivisionNumero {

    // Atributos
    private int numero1;
    private int numero2;

    // Constructores
    public DivisionNumero(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public DivisionNumero() {
    }

    // Getters y Setters
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    // To String
    @Override
    public String toString() {
        return "DivisionNumero [numero1=" + numero1 + ", numero2=" + numero2 + "]";
    }

    public int dividir() {
        return numero1 / numero2;
    }

}
