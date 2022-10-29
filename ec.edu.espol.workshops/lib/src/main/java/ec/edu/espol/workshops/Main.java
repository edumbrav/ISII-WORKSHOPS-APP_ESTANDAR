package ec.edu.espol.workshops;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer(89,'F',"not married", false);
		boolean valor = CarInsurance.comprobar(c);
		if(valor && c.isPermiso()) {
			c.setPrima(500);
			CarInsurance.calcularPrima(c);
			System.out.println(c.getPrima());
		}else {
			c.setPrima(-1);
			if(!c.isPermiso()) {
				System.out.println("No puede tener seguro porque el cliente no tiene permiso de conducir ");

			}
			if(!valor) {
				System.out.println("No puede tener seguro porque el cliente tiene "+c.getEdad()+" anios");
			}

		} 
		
		
	}

}
