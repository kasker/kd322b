package BikeShop;

import java.awt.Color;

public class Constants {
	public static int MIN_SIZE= 8; //tum
	public static int MAX_SIZE = 29; //tum
	public static int MIN_PRICE = 0; // kr
	public static int MAX_PRICE = 3000; //kr

	public static String[] myColors = {"red", "green", "blue","white","yellow"};
	
	
	/**  Creates a method for checking if a color is allowed or not	*/
	public static String colorCheck(String col){
		boolean check = false;
		for(int i = 0; i < myColors.length; i++){
			if(col.equals(myColors[i])){
				check = true;
			}
		}
		if(check == true){
			return col;
		} else {
			return "No color";
		}
	}
	
}
