import Package.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
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

        System.out.println(MostrarArrayList(Inventario));



    }
    public static String MostrarArrayList (List<Productos> inventario){
        String aux = "";
        for (Productos producto:inventario){
            aux += producto.toString()+"\n";
        }
        return aux;
    }
}