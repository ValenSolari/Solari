package Package;

public class Notebook extends Informatica{
    private int memoria;

    ///region Constructor

    public Notebook(String nombre, int stock, int precio, String fabricante, int memoria) {
        super(nombre, stock, precio, fabricante);
        this.memoria = memoria;
    }

    public Notebook() {
    }

    ///endregion

    ///region Get and Set

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    ///endregion

    ///region Metodos
    @Override
    public String toString() {
        return "Notebook{" +
                "memoria=" + memoria +
                "GB } " + super.toString();
    }

    ///endregion
}
