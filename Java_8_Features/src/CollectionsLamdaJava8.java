import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
			if(o1 < o2)
				return -1;
			else if(o1 > o2)
				return 1;
			else 
				return 0;
	}
	
}

public class CollectionsLamdaJava8 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(15);
		arr.add(5);
		arr.add(0);
		arr.add(7);
		arr.add(20);
		
		System.out.println(arr);
		
		//Collections.sort(arr,new MyComparator());
		//Instead of the above line that is passing a new class that is implementing comparator interface
		
		//We can use lamda expressions like below
		Collections.sort(arr,(o1,o2)-> o1<o2?-1:o1>o2?1:0);
		
		System.out.println(arr);
		
		//For each data in the stream print the values
		arr.stream().forEach(System.out::println);
		List<Integer> evenList = arr.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("---------------------------------");
		evenList.stream().forEach(System.out::println);
		//Comparator 
		//int compare(Object obj1, Object obj2)
		//		returns -ve if  obj1 has to come before obj2
		//		returns +ve if  obj1 has to come after obj2
		//		returns ==  if  obj1 is equal to obj2
		
		
	}

}
