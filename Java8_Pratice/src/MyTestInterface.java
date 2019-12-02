
public interface MyTestInterface {
	
	
	public void m1(); 
	
	default void m2() {
	   System.out.println("Test");
	}
}
