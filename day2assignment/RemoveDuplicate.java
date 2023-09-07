package week3.day2assignment;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "PayPal India";
        int length = input.length();
        char[] ch = input.toCharArray(); 
        
        Set<Character> charSet = new TreeSet<Character>();
        
        Set<Character> dupCharSet = new TreeSet<Character>();
        
        for (int i = 0; i < ch.length; i++) {
            
            if(!charSet.add(ch[i])) { 
                dupCharSet.add(ch[i]);
            }
        }

System.out.println("charSet : " +charSet);
        System.out.println("dupCharSet : " +dupCharSet);
        charSet.removeAll(dupCharSet);
        for (Character character : charSet) {
            if(character!=' ') {
                System.out.println(character);
            }
        }
        
    }
}

