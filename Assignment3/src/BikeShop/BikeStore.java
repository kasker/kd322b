package BikeShop;

import java.util.ArrayList;

public class BikeStore {
	private String allBikes;
	private String newBikes;
	
	static ArrayList<Bikes> Bike = new ArrayList<Bikes>();
	
	public String getAllBikes(){
		String s = "";
		for(int i = 0; i < Bike.size(); i++){
			Bikes Bike1 = Bike.get(i);
			s = s + "The color of the bike is " + Bike1.getColor() + "\n"  + "\t The size is " + Bike1.getSize()+ "\n" + "\t The price is " + Bike1.getPrice() + "\n";
		}
		return s;
	}
	
	public void addBike(String _color, int size, int price){
		Bike.add(new Bikes(_color.toLowerCase(),size,price));
	}
	
}