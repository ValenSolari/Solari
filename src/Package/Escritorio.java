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
        return super.toString()+"Escritorio{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                "} ";
    }                                ///Inciso 2

    @Override
    public void Aumento() {
        System.out.println(toString());
        System.out.println("Precio anterior= "+getPrecio());
        int aux;
        aux = getPrecio()+((getPrecio()*10)/100);
        setPrecio(aux);
        System.out.println("Precio anterior= "+getPrecio());
    }                                    ///Inciso 5

    ///endregion
}
