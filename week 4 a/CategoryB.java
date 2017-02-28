public class CategoryB implements SalaryCalculator {
	double saleAmt;
	double baseSalary;
	final static double commission = 0.02;

	public CategoryB(double sa, double base){
		baseSalary = base;
		saleAmt = sa;
	}

	public double getSalary() {
		double value =0;
		value = commission * saleAmt;
		value = baseSalary + value;
		return value;
	}

}
