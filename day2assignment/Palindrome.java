package week3.day2assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="madam";
String rev="";
int length = name.length();
for (int i =length-1; i >=0; i--) {
	rev=rev+(name.charAt(i));
	System.out.println(rev);
	                             
}

if (name.equals(rev)) {
	
System.out.println("The given name " + name + " is palindrome");
}else {
    System.out.println("The given name " + name + " is not a palindrome");
}

	}

}

	
	

