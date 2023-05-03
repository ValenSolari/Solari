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
    public String toString() {                          ///Inciso 3
        return super.toString()+"Mueble{ ";
    }

    @Override
    public void Aumento() {}                           ///Inciso 5

    ///endregion

}
