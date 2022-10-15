package ec.edu.espol.workshops;

public class main {

	public static void main(String[] args) {
		Customer c = new Customer(89,'F',"not married", false);
		boolean valor = CarInsurance.comprobar(c);
		if(valor && c.isPermiso()) {
			c.setPrima(500);
			CarInsurance.calcularPrima(c);
			System.out.println(c.getPrima());
		} 
		
		
	}

}
