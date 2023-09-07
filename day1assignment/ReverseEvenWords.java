package week3.day1assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="I am a software tester";
        
        String[] words = input.split(" ");
        
        String output ="";
        
        for (int i = 0; i < words.length; i++) {
            
            if(i%2!=0) {
                String reverse = words[i];
                String rev="";
                for (int j =reverse.length()-1; j>=0; j--) {
                  rev = rev + reverse.charAt(j);
                }
                output = output + rev +" "; 
            }else {
                output= output + words[i] + " "; 
            }
            
        }
        
        System.out.println(output);
        
	}

}
