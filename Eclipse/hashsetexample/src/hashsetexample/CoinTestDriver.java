package hashsetexample;
import java.util.*;
public class CoinTestDriver {

	public static void main(String[] args) {
		HashSet<Coin> bagOfCoins=new HashSet<Coin>();
		
		Coin coin1=new Coin(1);
		Coin coin2=new Coin(2);
		Coin coin5=new Coin(5);
		Coin coin10=new Coin(10);
		Coin coin20=new Coin(20);
		Coin coin50=new Coin(50);
		Coin coin100=new Coin(100);
		
		bagOfCoins.add(coin1);
		bagOfCoins.add(coin2);
		bagOfCoins.add(coin5);
		bagOfCoins.add(coin10);
		bagOfCoins.add(coin20);
		bagOfCoins.add(coin50);
		bagOfCoins.add(coin10);
		
		findCoin(bagOfCoins,coin10);
		findCoin(bagOfCoins,coin100);
		
		 displayBagContents(bagOfCoins);
		 displayBagDetails(bagOfCoins);
		 
		 bagOfCoins.clear();
		 
		 displayBagDetails(bagOfCoins);
	}
	
	static void findCoin(HashSet<Coin> bagOfCoins,Coin coin) {
		if(bagOfCoins.contains(coin))
			System.out.println("There is a "+ coin.getDenomination()+" in the bag");
		else
			System.out.println("There is no "+ coin.getDenomination()+" in the bag");
	}
	
	static void displayBagContents(HashSet<Coin> bagOfCoins) {
		for(Coin coin:bagOfCoins) {
			System.out.print(coin.getDenomination()+" ");
		}
	}
	
	static void displayBagDetails(HashSet<Coin> bagOfCoins) {
		if(bagOfCoins.isEmpty())
			System.out.println("Bag is empty");
		else
			System.out.println("\nSize of bag is: "+bagOfCoins.size());
	}

}
