
public class TestFunctinalityAbstract extends FeatureTest{

	@Override
	int blankLogic() {
		// TODO Auto-generated method stub
		
		return 478;
	}
	
	public static void main(String[] args) {
		FeatureTest ft= new TestFunctinalityAbstract();
		int sum=ft.addLogic();
		System.out.println("Sum of number is " +ft.addLogic());
		System.out.println( ft.blankLogic());
	}

}
