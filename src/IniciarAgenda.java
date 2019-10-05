public class IniciarAgenda{
    public static void main (String [ ] args) {
        Agenda A=new Agenda();
Recordatorio recordatorio1=new Recordatorio();
Recordatorio recordatorio2=new Recordatorio();
Recordatorio recordatorio3=new Recordatorio();
recordatorio1.Setnombre("Cumpleaños");
recordatorio2.Setnombre("Varios");
        recordatorio3.Setnombre("Boda");
       recordatorio1.SetFecha(1,12,2000);
        recordatorio2.SetFecha(4,6,2000);
        recordatorio3.SetFecha(9,10,2001);
        recordatorio1.SetTexto("Comprar Regalo");
        A.add(recordatorio1);
        A.add(recordatorio2);
        A.add(recordatorio3);
        System.out.println(A.count());
        A.elementos();
        A.mostrar();
    }
}
