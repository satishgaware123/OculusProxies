package String;

public class printVowules {

	public static void main(String[] args) {
		
		String s1 = "satish gaware";
		
		for(int i=0; i<s1.length(); i++) 
		{
			char ch = s1.charAt(i);
			if(isvowels(ch))
			{
				System.out.println(ch +" ");				
			}
	  	
		}

	}
	public static boolean isvowels(char ch) {
		
		ch = Character.toLowerCase(ch);
		
		return ch=='a'|| ch=='e' || ch=='i' ||ch=='o' || ch=='u';	
		
	}

}
