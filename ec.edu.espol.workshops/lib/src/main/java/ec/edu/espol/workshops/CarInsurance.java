package ec.edu.espol.workshops;

public class CarInsurance {
	
	public static void calcularPrima(Customer c) {
		if(c.getSexo() == 'M' && c.getEstado().equals("not married") && c.getEdad() < 25) {
			c.setPrima((c.getPrima()+1500));
		}
	}
}
