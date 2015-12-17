import java.util.HashMap;

public class Dry extends Product {

	public static String[] dryDimensions = { "oz", "cup", "lbs", "g" };

    private HashMap<String,Integer> dimensions;

	public Dry(String name, double amount, String dimension) {
		super(name, amount, dimension);
        dimensions = new HashMap<>();
        fill();
	}

	String NormalDimension() {
		return "g";
	}

	public double NormalAmount(String s) {
		double NormalAmount = 1;
		switch (s) {
		case "cup":
			NormalAmount = 200 * amount();
			break;
		case "oz":
			NormalAmount = amount() * 28;
			break;
		case "lbs":
			NormalAmount = amount() * 454;
			break;
		case "g":
			NormalAmount = amount();
			break;
		}
		return NormalAmount;
	}

    private  void fill(){
        dimensions.put("cup",200);
        dimensions.put("oz",28);
        dimensions.put("lbs",454);
        dimensions.put("g",1);
    }

    public double proportionalAmount(String from,String to){
        double r=0;
        r=NormalAmount(from);
        r=r/dimensions.get(to);
        return r;
    }


}
