import java.util.LinkedList;
import java.util.Iterator;
public class Agenda extends Recordatorio implements IAgenda {
    public  LinkedList<Recordatorio> Agenda = new LinkedList<Recordatorio>();

    public void add(Recordatorio re) {
        Agenda.add(re);
    }

    public void remove(int x) {
        Agenda.remove(x);
    }

    public int count() {
    return   Agenda.size();

    }
public void elementos()
{
    Iterator<Recordatorio> it = Agenda.iterator();
    System.out.println("Elementos de la Agenda:");
    while(it.hasNext()){
        Recordatorio aux=it.next();
        System.out.println(aux.Getnombre());
        System.out.println("-------------------------------------");

    }
}
    public void mostrar() {
        Iterator<Recordatorio> it = Agenda.iterator();

        while (it.hasNext()) {
            Recordatorio aux=it.next();
            System.out.println("Nombre:" + aux.Getnombre() + "\n");
            System.out.println("Fecha:" + aux.GetFecha() + "\n");
            System.out.println("Recuerda:" + aux.GetTexto() + "\n");
            System.out.println("-------------------------------------");
        }

    }
}
