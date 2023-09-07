package week3.day2assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="iswarya";
char[] ch = name.toCharArray();
 Set<Character> name1=new HashSet<Character>();
 
 for (Character Character : ch) {
	 name1.add(Character);
	
}
 System.out.println(name1);
	}

}
