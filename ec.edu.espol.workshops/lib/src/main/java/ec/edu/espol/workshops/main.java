package ec.edu.espol.workshops;

/**
 * @author Maria
 */
public class main {
  public static void main(String[] args) {
    Customer c = new Customer(89, 'F', "not married", false);
    boolean valor = CarInsurance.comprobar(c);
    if (valor && c.isPermiso()) {
      c.setPrima(500);
      CarInsurance.calcularPrima(c);
      System.out.println(c.getPrima());
    } else {
      c.setPrima(-1);
      if (!c.isPermiso()) {
        System.out.println("No puede tener seguro ya que el cliente no tiene permiso de conducir ");
      }
      if (!valor) {
        System.out.println("No puede tener ya que el cliente tiene " + c.getEdad() + " anios");
      }
    } 
  }
}
