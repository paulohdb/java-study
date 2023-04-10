import java.sql.Time;

public class Main {
  public static void main(String[] args) {
    Time t1,t2;
    t1 = new Time(8,30,0);
    t2 = new Time(5,0,0);
    Time [] funcionamento = {t1,t2};
    Restaurante r = new Restaurante("Burguer King", "av. Afonso Pena", funcionamento);
    System.out.println(r.imprimeHorario());
    
    t1 = new Time(00,00,00);
    Time [] funcionamento2 = {t1,t1};
    String [] pratos = {"BicMac", "McLanche", "batata frita", "coca cola"};
    double[] faturamento = {10.0, 2, 3.5, 4.3, 5.2, 2., 0};
    Restaurante mc = new Restaurante("McDonalds", "Av. Mato Grosso", 
        funcionamento2, pratos, faturamento);
    System.out.println(mc.imprimeHorario());
    System.out.println(mc.calculaLucro());
  }
}
