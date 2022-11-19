package ec.edu.espol.workshops;

public class CarInsurance {
	
	private int prima;
	
	public static boolean comprobar(Customer c) {
		if(c.getEdad()<80) {
			return true;
		}
		return false;
	}
	
	public static void calcularPrima(Customer c) {
				if(c.getSexo() == 'M' && c.getEstado().equals("not married") && c.getEdad() < 25) {
					c.setPrima((c.getPrima()+1500));
				}
				if(c.getSexo()=='F' || c.getEstado().equals("married")) {
					c.setPrima((c.getPrima()+ 200));
				}
				if(c.getEdad()>45 && c.getEdad()<65) {
					c.setPrima(c.getPrima()-100);
			}	
		}
	
}
