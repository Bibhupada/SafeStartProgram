import java.util.*;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String[] args) {
		List<Integer> myList= new ArrayList();
		for(int i=0;i<100;i++) {
			myList.add(i);
		}
		
		Stream<Integer> sequentialStream= myList.stream();
		
		
		Stream<Integer> parallelStream= myList.parallelStream();
		
		Stream<Integer> highNums= parallelStream.filter(p-> p>90);
		
		System.out.println(sequentialStream);
		System.out.println(parallelStream);
		System.out.println(highNums);
		
	}

}
