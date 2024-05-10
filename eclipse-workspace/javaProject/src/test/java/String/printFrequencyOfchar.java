package String;

import java.util.HashMap;

public class printFrequencyOfchar {

	public static void main(String[] args) {

     String s1 = "Satish gaware";
     
	HashMap<Character, Integer> mp = new HashMap<Character, Integer>();	
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(ch!=' ')
			{
				if(mp.containsKey(ch))
				{
				mp.put(ch, mp.get(ch)+1);
				}
				else {
					mp.put(ch, 1);
					
    	}	
	}						
}

		for(char ch: mp.keySet()) 
		{
			System.out.println(ch+" "+mp.get(ch));
						
		}				
   }
}
