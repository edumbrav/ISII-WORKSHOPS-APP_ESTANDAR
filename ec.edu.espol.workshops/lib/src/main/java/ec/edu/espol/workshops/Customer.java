package ec.edu.espol.workshops;

public class Customer {

	private int edad;
	private char sexo;
	private String estado;

	public Customer(int edad, char sexo, String estado) {
		super();
		this.edad = edad;
		this.sexo = sexo;
		this.estado = estado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}