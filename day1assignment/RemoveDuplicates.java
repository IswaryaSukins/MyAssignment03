package week3.day1assignment;



public class RemoveDuplicates {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] sp = text.split(" ");
		text.toLowerCase();
		for(int i=0;i<sp.length;i++) {
			count=1;
			for(int j = i+1 ; j<sp.length; j++) {
				if(sp[i] == (sp[j])){
					
					count=count+1;
					sp[j]="0";
				}	
				if(count >1) {
					if(sp[i]!= "0") { 
				}
						System.out.print(sp[i] + "0");
				}
			}
		}
		

	}}


