package Package;

public class Mueble extends Productos{

    ///region Constructor

    public Mueble(String nombre, int stock, int precio) {
        super(nombre, stock, precio);
    }

    public Mueble() {
    }

    ///endregion

    ///region Get and Set


    ///endregion

    ///region Metodos
    @Override
    public String toString() {
        return "Mueble{} " + super.toString();
    }


    ///endregion

}
