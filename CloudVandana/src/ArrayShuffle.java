import java.util.*;

public class ArrayShuffle {

	public static void main(String[] args) {
		
		Integer[] array = {1,2,3,4,5,6,7};
		
		List<Integer> shuffeledList = new ArrayList<>(Arrays.asList(array));
		
		// shuffeled using in-Built method
		
		Collections.shuffle(shuffeledList);
		
		// suffeled list is again converted into array by using to array method
		
		System.out.println(Arrays.toString(shuffeledList.toArray()));
		
		
		
		


	}

}
