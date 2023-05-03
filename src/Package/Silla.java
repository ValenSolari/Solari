package Package;

public class Silla extends Mueble implements Idescuento{
    private boolean ruedas;

    ///region Constructor

    public Silla(String nombre, int stock, int precio, boolean ruedas) {
        super(nombre, stock, precio);
        this.ruedas = ruedas;
    }

    public Silla(String nombre, int stock, int precio) {
        super(nombre, stock, precio);
    }
    ///endregion

    ///region Get and Set

    public boolean isRuedas() {
        return ruedas;
    }

    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }


    ///endregion

    ///region Metodos
    @Override
    public String toString() {                                   ///Inciso 2
        return super.toString()+"Silla{" +
                "ruedas=" + ruedas +
                "} ";
    }

    @Override
    public int precioFinal(int descuento) {                        ///Inciso 4
        int aux=0;
        aux=getPrecio()-((getPrecio()*descuento)/100);

        System.out.println("El precio final con el descuento especial de "+descuento
                + "% deja a la silla en "+aux+"$");

        return aux;
    }

    @Override
    public void Aumento() {                                          ///Inciso 5
        System.out.println(toString());
        System.out.println("Precio anterior= "+getPrecio());
        int aux;
        aux = getPrecio()+((getPrecio()*5)/100);
        setPrecio(aux);
        System.out.println("Precio anterior= "+getPrecio());
    }


    ///endregion
}
