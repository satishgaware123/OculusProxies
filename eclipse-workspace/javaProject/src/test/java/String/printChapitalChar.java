package String;

public class printChapitalChar {

	public static void main(String[] args) {
	
		String s1 = "satisH Gaware";
		char ch	;
		for(int i=0; i<s1.length(); i++)
		{
		 ch = s1.charAt(i);
			
			if(Character.isUpperCase(ch) )
			{			
				System.out.println(ch);
			}	
			
		}

	}

}
