package ec.edu.espol.workshops;

public class main {

	public static void main(String[] args) {
		Customer c = new Customer(24,'M',"not married");
		CarInsurance.calcularPrima(c);
		System.out.println(c.getPrima());
		
	}

}
