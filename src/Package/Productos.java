package Package;

public abstract class Productos {
    
    private String nombre;
    private int stock;
    private int precio;


    ///region Constructor
    public Productos(String nombre, int stock, int precio) { ///constructor lleno
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public Productos() {///constructor vacio
    }

    ///endregion

    ///region Get and set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    ///endregion

    ///region Metodos
    @Override
    public String toString() {                          ///Inciso 3
        return "Productos{" +
                "nombre='" + nombre + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                '}';
    }

    public abstract void Aumento ();                   ///Inciso 5

    ///endregion
}
