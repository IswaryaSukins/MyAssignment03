package week3.day1assignment;

public class Automation implements Language,TestTool{

	public void Selenium() {
		// TODO Auto-generated method stub
	System.out.println("selenium");	
	}

	public void Java() {
		// TODO Auto-generated method stub
	System.out.println("java");
	}
	public void Python() {
		System.out.println("python");

}
	public void Ruby() {
	}
	public static void main(String[] args) {
		Automation op=new Automation();
		op.Java();
		op.Python();
		op.Ruby();
		op.Selenium();
	}
	}
