package bikeproject;
import java.util.*;
public class BikeList {

	public static void main(String[] args) {
		ArrayList<String> bikes=new ArrayList<String>();
		int mountainBikeSales=0,roadBikeSales=0;
		fillArray(bikes);
		displayStock(bikes);
		displayBikeNumbers(bikes);
	}
	
	static void fillArray(ArrayList<String> bikes) {
		int i=(int)Math.random();
		if(i==1)
			bikes.add("Road Bike "+i);
		else
			bikes.add("Mountain Bike ");
	}
	
	static void displayStock(ArrayList<String> bikes) {
		for(String bikeName: bikes)
			System.out.println(bikeName);
	}
	
	static int calculateStock(ArrayList<String> bikes) {
		int bikesSold=0;
		for(String bikeName:bikes) {
			if(bikeName.equals("Mountain Bike ")) {
				bikesSold++;
			}
		}
		return bikesSold;
	}
	
	static void displayBikeNumbers(ArrayList<String> bikes) {
		int mb,rb;
		mb=calculateStock(bikes);
		rb=bikes.size()-mb;
		System.out.println("Stock Levels\nWe have "+mb+" Mountain Bikes in stock\nWe have "+rb+" Road Bikes in stock");
	}
}
