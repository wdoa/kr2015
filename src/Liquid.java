import java.util.HashMap;

public class Liquid extends Product {

    private HashMap<String,Integer> dimensions;

	public static String[] dryDimensions = { "oz", "cup", "l", "g" ,"ml","tsp","tbsp"};

	public Liquid(String name, double amount, String dimension) {
		super(name, amount, dimension);
        dimensions = new HashMap<>();
        fill();
	}

	String NormalDimension() {
		return "ml";
	}

	public double NormalAmount(String s) {
		double NormalAmount = 1;
		switch (s) {
		case "ml":
			NormalAmount = amount();
			break;
		case "l":
			NormalAmount = amount() * 1000;
			break;
		case "cup":
			NormalAmount = 225 * amount();
			break;
		case "oz":
			NormalAmount = amount() * 30;
			break;
		case "tsp":
			NormalAmount = amount() * 6;
			break;
		case "tbsp":
			NormalAmount = amount() * 15;
			break;
		case "g":
			NormalAmount = amount();
			break;
		}
		return NormalAmount;
	}

    private  void fill(){
        dimensions.put("cup",225);
        dimensions.put("oz",30);
        dimensions.put("tsp",6);
        dimensions.put("tbsp",15);
        dimensions.put("l",1000);
        dimensions.put("ml",1);
        dimensions.put("g",1);
    }

    public double proportionalAmount(String from,String to){
        double r=0;
        r=NormalAmount(from);
        r=r/dimensions.get(to);
        return r;
    }

}
