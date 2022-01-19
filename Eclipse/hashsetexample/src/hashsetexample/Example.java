package hashsetexample;
import java.util.*;
public class Example {

	public static void main(String[] args) {
		/*Set set=new TreeSet();
		set.add(2);
		set.add(1);
		System.out.print(set);*/
		Integer[] ar= {1,2,1,3};
		Set<Integer>set=new TreeSet<Integer>(Arrays.asList(ar));
		set.add(4);
		for(Integer element:set)
			System.out.print(element);
	}

}
