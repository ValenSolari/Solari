package Package;

public class Informatica extends Productos{
    private String fabricante;

    ///region Constructor

    public Informatica(String nombre, int stock, int precio, String fabricante) {
        super(nombre, stock, precio);
        this.fabricante = fabricante;
    }

    public Informatica() {
    }

    ///endregion

    ///region Get and set

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    ///endregion

    ///region Metodos
    @Override
    public String toString() {                      ///Inciso 3
        return super.toString()+"Informatica{" +
                "fabricante='" + fabricante + '\'' +
                "} " ;
    }

    @Override
    public void Aumento(){}                             ///Inciso 5


    ///endregion


}
