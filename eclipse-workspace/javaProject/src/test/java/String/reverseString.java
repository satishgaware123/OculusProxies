package String;

public class reverseString {

	public static void main(String[] args) {

		String s1 = "satish gaware";
		String s2 = "";
		
		for(int i=0; i<=s1.length()-1; i++) {
			
			s2 = s1.charAt(i)+s2;
			
		}
		
		System.out.println(s2);	
		
	}

}
