package CostCalculator;

public class CostCalculatorMain {
	
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println("This program aims to take items on Amazon and");
		System.out.println("figure out which is the most resonable priced");
		
		Cost_Calculations calc = new Cost_Calculations();
		
		calc.setUnit_cost(4.40);
		calc.setWeight_grams(170);
		calc.setNumber_of_items(1);
		calc.setShipping_cost(15.12);

		
		System.out.println("cost\t = \t$" + calc.getUnit_cost());
		System.out.println("weight\t = \t" + calc.getWeight_grams() + "g");
		System.out.println("items\t = \t" + calc.getNumber_of_items());
		System.out.println("shipping = \t$" + calc.getShipping_cost());
		
		
		System.out.println("\nCalculated:");
		System.out.println("cost/gram \t\t=\t$" + calc.perGramCost(calc.getUnit_cost(), calc.getWeight_grams()));
		System.out.println("cost/gram .w shipping\t=\t$" + calc.perGramCostShipping(calc.getUnit_cost(), calc.getShipping_cost(), calc.getWeight_grams(), calc.getNumber_of_items()));
		

		
		
		
		
		
		/*

		double unit_cost;
		double weight_grams;
		double shipping_cost;
		double number_of_items;
		double res_cost_per_gram;
		double res_cost_per_gram_shipping;
		
		unit_cost = 4.40;
		weight_grams = 170;
		number_of_items = 1;
		shipping_cost = 15.12;
		
		res_cost_per_gram = unit_cost / weight_grams;
		res_cost_per_gram_shipping = (unit_cost + shipping_cost) /  (weight_grams + number_of_items);

		
		
		System.out.println("Cost per gram = \t\t$" + res_cost_per_gram);
		System.out.println("Cost per gram w. shipping = \t$" + res_cost_per_gram_shipping);
		
		*/
		
		
		
	}
}
