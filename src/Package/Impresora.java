package Package;

public class Impresora extends Informatica implements Idescuento{
    private int impresionXMinnuto;

    ///region Constructor
    public Impresora(String nombre, int stock, int precio, String fabricante, int impresionXMinnuto) {
        super(nombre, stock, precio, fabricante);
        this.impresionXMinnuto = impresionXMinnuto;
    }

    public Impresora() {
    }
    ///endregion

    ///region Get and Set

    public int getImpresionXMinnuto() {
        return impresionXMinnuto;
    }

    public void setImpresionXMinnuto(int impresionXMinnuto) {
        this.impresionXMinnuto = impresionXMinnuto;
    }


    ///endregion

    ///region Metodos
    @Override
    public String toString() {                      ///Inciso 3
        return super.toString() +"Impresora{" +
                "impresionXMinnuto=" + impresionXMinnuto +
                "} ";
    }

    @Override
    public int precioFinal(int descuento) {                     ///Inciso 4
        int aux=0;
        aux=getPrecio()-((getPrecio()*descuento)/100);

        System.out.println("El precio final con el descuento especial de "+descuento
                + "% deja a la impresora en "+aux+"$");

        return aux;
    }

    @Override
    public void Aumento() {                                   ///Inciso 5
        System.out.println(toString());
        System.out.println("Precio anterior= "+getPrecio());
        int aux;
        aux = getPrecio()+((getPrecio()*15)/100);
        setPrecio(aux);
        System.out.println("Precio anterior= "+getPrecio());
    }


    ///endregion
}
