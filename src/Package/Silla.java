package Package;

public class Silla extends Mueble{
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
    public String toString() {
        return "Silla{" +
                "ruedas=" + ruedas +
                "} " + super.toString();
    }


    ///endregion
}
