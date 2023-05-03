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
    public String toString() {                              ///Inciso 2
        return  super.toString() +"Notebook{" +
                "memoria=" + memoria +
                "GB } ";
    }
    @Override
    public void Aumento() {                                 ///Inciso 5
        System.out.println(toString());
        System.out.println("Precio anterior= "+getPrecio());
        int aux;
        aux = getPrecio()+((getPrecio()*20)/100);
        setPrecio(aux);
        System.out.println("Precio anterior= "+getPrecio());
    }

    ///endregion
}
