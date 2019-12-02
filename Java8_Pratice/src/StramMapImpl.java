import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors; 

public class StramMapImpl {
	
	public static void main(String[] args) {
		
		Map<String, String> books = new HashMap<>();
		
		books.put("978-0201633610", "Design patterns : elements of reusable object-oriented software");
		books.put("978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
		books.put("978-0134685991", "Effective Java");
		
		//to obtain set of key and value pair
		Set<Map.Entry<String, String>> entries = books.entrySet();
		//to get associated key set
		Set<String> keySet = books.keySet();
		//to get directly values of map
		Collection<String> values = books.values();
		
		//So at each point we can get stream and process it.
		Stream<Map.Entry<String, String>> entriesStream = entries.stream();
		Stream<String> valuesStream = values.stream();
		Stream<String> keysStream = keySet.stream();
		
		//To get Key of the Map with filter
		Optional<String> optionalIsbn = books.entrySet().stream()
				  .filter(e -> "Non Existent Title".equals(e.getValue()))
				  .map(Map.Entry::getKey).findFirst();
		System.out.println(optionalIsbn);
		
		//To get all data matched with particular value.
		List<String> isbnCodes = books.entrySet().stream()
				  .filter(e -> e.getValue().startsWith("Effective Java"))
				  .map(Map.Entry::getKey)
				  .collect(Collectors.toList());
		System.out.println(isbnCodes);
		
		//get Map values with key
		List<String> titles = books.entrySet().stream()
				  .filter(e -> e.getKey().startsWith("978-0"))
				  .map(Map.Entry::getValue)
				  .collect(Collectors.toList());
		System.out.println(titles);
		
	}

}
