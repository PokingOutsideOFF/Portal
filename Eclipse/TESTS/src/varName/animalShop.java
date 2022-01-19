package varName;
import java.util.*;
public class animalShop {

	private String name;
	private String breed;
	private String barkNoise="Woof";
	private double weight;
	
	animalShop(String n,String b,double w)
	{
		name=n;
		breed=b;
		weight=w;
	}
	animalShop(String n,String b,String bn,double w)
	{
			name=n;
			breed=b;
			barkNoise=bn;
			weight=w;
	}
	void bark()
	{
		System.out.println(barkNoise);
	}
	void bark(String b)
	{
		System.out.println(b);
	}
}

