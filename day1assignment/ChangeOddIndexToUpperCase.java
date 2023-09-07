package week3.day1assignment;


public class ChangeOddIndexToUpperCase {
	public static String changeOddIndex(String input) {
        
        String output="";
        String lowerCase = input.toLowerCase();

        String[] split = lowerCase.split("");
        for (int i = 0; i < split.length; i++) {
            if(i%2!=0) {
                output = output+(split[i].toUpperCase());
            }else {
                output = output+(split[i]);
            }
        }
        return output;
    }
    
    public static void main(String[] args) {
        System.out.println(changeOddIndex("Changeme"));
    }
    
}
