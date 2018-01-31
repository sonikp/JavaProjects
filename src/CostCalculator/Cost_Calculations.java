package CostCalculator;

public class Cost_Calculations {
	/**
	 * Calculations Engine
	 */
	
	private double unit_cost;
	private double weight_grams;
	private double shipping_cost;
	private double number_of_items;
	private double res_cost_per_gram;
	private double res_cost_per_gram_shipping;
	
	// constructors
	public void Cost_Calculations() {}	// empty constuctor
	public void Cost_Calculations (double unit_cost, double shipping_cost, double weight_grams, double number_of_items) {
		this.unit_cost = unit_cost;
		this.shipping_cost = shipping_cost;
		this.weight_grams = weight_grams;
		this.number_of_items = number_of_items;
	}
	
	// calculations
	public double perGramCost(double unit_cost, double weight_grams){
				
		 return res_cost_per_gram = unit_cost / weight_grams;
		
	}
	
	public double perGramCostShipping(double unit_cost, double shipping_cost, double weight_grams, double number_of_items ){
		
		return res_cost_per_gram_shipping = (unit_cost + shipping_cost) /  (weight_grams * number_of_items);
		
	}


	
	// getters and setters
	public double getUnit_cost() {
		return unit_cost;
	}

	public void setUnit_cost(double unit_cost) {
		this.unit_cost = unit_cost;
	}

	public double getWeight_grams() {
		return weight_grams;
	}

	public void setWeight_grams(double weight_grams) {
		this.weight_grams = weight_grams;
	}

	public double getShipping_cost() {
		return shipping_cost;
	}

	public void setShipping_cost(double shipping_cost) {
		this.shipping_cost = shipping_cost;
	}

	public double getNumber_of_items() {
		return number_of_items;
	}

	public void setNumber_of_items(double number_of_items) {
		this.number_of_items = number_of_items;
	}
	

	
//	unit_cost = 4.40;
//	weight_grams = 170;
//	number_of_items = 1;
//	shipping_cost = 15.12;
//	
//	res_cost_per_gram = unit_cost / weight_grams;
//	res_cost_per_gram_shipping = (unit_cost + shipping_cost) /  (weight_grams + number_of_items);
//	
}