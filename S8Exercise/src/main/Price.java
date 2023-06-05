package main;

import java.util.HashMap;
import java.util.Map;

public class Price {
	private Map<String, Double> rates;
	private Double value;
	
	public Price(Double value) {
		this.value = value;
		rates = new HashMap<String, Double>();
		rates.put("USD", 1D);
		rates.put("GBP", 0.6);
		rates.put("EUR", 0.8);
	}
	
	public Double convert(String toCurrency) {
		if(toCurrency.contentEquals("USD")) {
			return value;
		}
		else {
			Double conversion = rates.get("USD") * rates.get(toCurrency);
			return conversion * value;
		}
	}
	
	public String toString() {
		return this.value.toString();
	}

	// Here is Escaping Reference 
	// We are returning reference value
//	public Map<String, Double> getRates(){
//		return this.rates;
//	}
	
	public Map<String, Double> getRates(){
		return Map.copyOf(this.rates);
	}
}
