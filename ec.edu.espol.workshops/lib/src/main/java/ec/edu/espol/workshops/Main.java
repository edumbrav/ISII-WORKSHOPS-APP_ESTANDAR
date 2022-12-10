package ec.edu.espol.workshops;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer(89,'F',"not married", false);
		boolean valor = CarInsurance.comprobar(c);
		if(valor && c.isPermiso()) {
			c.setPrima(600);
			CarInsurance.calcularPrima(c);
		}else {
			c.setPrima(-1);
		} 
	}
}
