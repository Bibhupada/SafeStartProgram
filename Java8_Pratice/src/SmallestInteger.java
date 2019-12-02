import java.util.*;

public class SmallestInteger {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Eneter Number");
        String [] str= scan.nextLine().split(" ");
        int [] a = new int[str.length];
        int missing_Number = 0;
        for(int i=0;i<str.length;i++){
            a[i] = Integer.parseInt(str[i]);
        }
       Map<Integer,Integer> integer= new HashMap();
       
       for(int i=0;i<a.length+1;i++) {
    	   integer.put(i,a[i]);
       }
       
       for(int i=1;i<a.length+1;i++) {
    	   if(i == integer.get(i-1)) {
    		   missing_Number=i;
    	   }
       }
       
       System.out.println("Missing Number is"+ missing_Number);
		
	}

}
