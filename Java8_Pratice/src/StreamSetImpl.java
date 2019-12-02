import java.util.*;
import java.util.stream.Stream;

public class StreamSetImpl {
	
	public static void main(String[] args) {
		//Creating a Set
		Set<String> set = new HashSet<>(); 
		set.add("Bibhu");
		set.add("Bhubaneswer");
		set.add("Cuttack");
		Stream<String> stream= set.stream();
		
		stream.forEach(element->System.out.println(element + " "));
	}

}
