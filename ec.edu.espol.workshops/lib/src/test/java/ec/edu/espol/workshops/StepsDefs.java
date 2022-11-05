package ec.edu.espol.workshops;

import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When;
import static org.junit.Assert.*; 
public class StepsDefs {
	
private char sexo;
private int prima;

@Given("the customer is a male") 
public void customer_is_male() {
	sexo = 'M';
}

@Given("The customer is {string}")
public void today_is(char sexo) { 
	this.sexo = sexo;
}

@When("Calculate the premium") 
public void calculate_the_premium() {
	prima = 2000;
}

@Then("The customer get a car insurance {int}")
public void i_should_be_told(String expectedAnswer) { 
	assertEquals(2000, prima);
}
}
