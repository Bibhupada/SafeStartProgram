import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Stream Generation method
//Stream.of, Stream.generate() or Stream.iterate() , Steam from list

public class BoxStreamExample {
	
	public static void main(String[] args) {
		List<String> strings = Stream.of("how", "to", "do", "in", "java")
                .collect(Collectors.toList());
		
		//Necessary of box stream
		//The method collect(Supplier<R>, ObjIntConsumer<R>, BiConsumer<R,R>) in the type 
		 //IntStream is not applicable for the arguments (Collector<Object,?,List<Object>>)
		//IntStream.of(1,2,3,4,5)
	    //.collect(Collectors.toList());
		
		List<Integer> ints = IntStream.of(1,2,3,4,5)
                .boxed()
                .collect(Collectors.toList());
		System.out.println(ints);
		
		//To get the Maxium
		Optional<Integer> max = IntStream.of(1,2,3,4,5)
                .boxed()
                .max(Integer::compareTo);
		System.out.println(max);
	}

}
