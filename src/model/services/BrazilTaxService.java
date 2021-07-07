package model.services;


/*
 * Com essa pequena alteração o sistema não está preso às regras de
 * taxação de um úinco país, bastando pequenas alterações para que seja
 * feita a adaptação.
 * 
 * Criada a classe TaxService.
 */

// public class BrazilTaxService {

public class BrazilTaxService implements TaxService {

	public double tax(double amount) {
		if (amount <= 100.0) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}
}
