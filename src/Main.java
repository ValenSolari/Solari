import Package.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /// Solari Valentin
    /// Parcial laboratorio III Comision 5

    public static void main(String[] args) {
        List <Productos> Inventario=new ArrayList<>();

        Escritorio e = new Escritorio("Escritorio",10,200,40,20);
        Silla s = new Silla("Silla",10,100,true);
        Impresora i = new Impresora("Impresora",10,150,"HP",300);
        Notebook n = new Notebook("Notebook",10,250,"Lenovo",16);


        Inventario.add(e);
        Inventario.add(s);
        Inventario.add(i);
        Inventario.add(n);

        System.out.println("\n\nListado de productos:");
        System.out.println(MostrarArrayList(Inventario));/// Inciso 3

        System.out.println("\n\nPrecios especiales para clientes:");
        int precioFinalSilla = s.precioFinal(10);    ///Inciso 4
        int preciofFinalImpresora = i.precioFinal(5);///Inciso 4

        System.out.println("\n\n---------------------------------Aumento de precios---------------------------------");
        aumentarPrecios(Inventario);///Inciso 5

        System.out.println("\n\nListado de productos:(Nuevos precios)");
        System.out.println(MostrarArrayList(Inventario));



    }
    public static String MostrarArrayList (List<Productos> inventario){ ///Inciso 3
        String aux = "";
        for (Productos producto:inventario){
            aux += producto.toString()+"\n";
        }
        return aux;
    } ///Inciso 3

    public static void aumentarPrecios (List <Productos> inventario){///Inciso 5
        for (Productos producto:inventario){
            producto.Aumento();
        }
    }
}