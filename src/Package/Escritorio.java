package Package;

public class Escritorio extends Mueble{
    private int ancho;
    private int alto;

    ///region Constructor
    public Escritorio(String nombre, int stock, int precio, int ancho, int alto) {
        super(nombre, stock, precio);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Escritorio() {
    }
    ///endregion

    ///region Get and set

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }


    ///endregion

    ///region Metodos
    @Override
    public String toString() {
        return "Escritorio{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                "} " + super.toString();
    }


    ///endregion
}
