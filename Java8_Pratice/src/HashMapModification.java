import java.util.*;
import java.util.stream.Stream;

public class HashMapModification {
	
	
	public static void main(String[] args) {
		
		Map<String,String> myMap= new HashMap();
		myMap.put("SAPTest", "TestValue");
		myMap.put("SAPTest1", "TestValue");
		myMap.put("SAPTest2", "TestValue");
		myMap.put("AMTest1", "TestValue");
		myMap.put("AMTest2", "TestValue");
		
		Optional<String> optionalIsbn= myMap.entrySet().stream()
                  .filter(e-> e.getKey().startsWith("SAP"))
				       .map(Map.Entry::getValue).findFirst();
		myMap.put(optionalIsbn.get(), "bfwfqwk");
		System.out.println(optionalIsbn.get());
	}

}
