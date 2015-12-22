import java.util.ArrayList;

public class Recipe {
    public static String[] types = { "Dry", "Liquid"};
	private ArrayList<Product> recipe;
    private int comboNumber;

    public int getComboNumber() {
        return comboNumber;
    }

    public void setComboNumber(int comboNumber) {
        this.comboNumber = comboNumber;
    }

    Recipe() {
		recipe = new ArrayList<>();
        comboNumber=7;

	}

	public void add(String type, String name, double amount,
			String dimension) {

		switch (type) {
		case "Liquid":
			recipe.add(new Liquid(name, amount, dimension));
			break;
		case "Dry":
			recipe.add(new Dry(name, amount, dimension));
			break;
		}
	}
	
	public int Search(String Name){
		for(int i=0;i<recipe.size();i++){
			if(Name.equals(recipe.get(i).name())){System.out.println(i);
			return i;}
		}
		return 0;
	}

}
