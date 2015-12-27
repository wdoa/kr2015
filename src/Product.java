abstract class Product {
	private String name;
	private double amount;
	private String dimension;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	Product(String name, double amount, String dimension) {
		this.name = name;
		this.amount = amount;
		this.dimension = dimension;
	}

	public double NormalAmount() {
		double NormalAmount = 1;
		return NormalAmount;
	}

	public double NormalAmount(String s) {
		double NormalAmount = 1;
		return NormalAmount;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	String name() {
		return name;
	}

	String dimension() {
		return dimension;
	}

	double amount() {
		return amount;
	}

	public double ProportionalAmount(double proportion,String s) {
		double ProportionalAmount = NormalAmount(s) * proportion;
		return ProportionalAmount;
	}

	String NormalDimension() {
		String normalDimension = "רע";
		return normalDimension;
	}
	public double proportionalAmount(String from,String to){
		return 0;
	}
	public double proportionalAmount(double a,String to){return 0;}

}
