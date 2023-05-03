package Package;

public class Impresora extends Informatica{
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
    public String toString() {
        return "Impresora{" +
                "impresionXMinnuto=" + impresionXMinnuto +
                "} " + super.toString();
    }


    ///endregion
}
