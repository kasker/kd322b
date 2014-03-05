package BikeShop;

import java.util.ArrayList;

public class Main {
	public static void main(String[]args){

		Bikes Bike1 = new Bikes("red", 10, 1200);
		Bikes Bike2 = new Bikes("white", 9, 1000);
		Bikes Bike3 = new Bikes("green", 20, 1300);
		Bikes Bike4 = new Bikes("blue", 8, 800);
		Bikes Bike5 = new Bikes("red", 8, 900);
		Bikes Bike6 = new Bikes("yellow", 11, 1400);
		Bikes Bike7 = new Bikes("green", 15, 2000);
		Bikes Bike8 = new Bikes("blue", 17, 2000);
		Bikes Bike9 = new Bikes("yellow", 22, 2500);
		Bikes Bike10 = new Bikes("red", 28, 3000);   

		ArrayList<Bikes> myBike = new ArrayList<Bikes>();
		
		myBike.add(Bike1);
		myBike.add(Bike2);
		myBike.add(Bike3);
		myBike.add(Bike4);
		myBike.add(Bike5);
		myBike.add(Bike6);
		myBike.add(Bike7);
		myBike.add(Bike8);
		myBike.add(Bike9);
		myBike.add(Bike10);

		//skriv ut platsnr, pris, färg, storlek för alla cyklar.
		for(int i = 0; i<myBike.size(); i++){ // loopar igenom alla bikes
			System.out.println("the price of the bike is " + myBike.get(i).getPrice() + "\t the size is " + myBike.get(i).getSize() + "\t the color is " + myBike.get(i).getColor() + "\n" ); // skriver ut pris, storlek och farg
		}
	
	}}
