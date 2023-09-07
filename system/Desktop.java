package org.system;

public class Desktop extends Computer{
public void DesktopSize() {
	System.out.println("Desktop size is 20.5inches");
}
public static void main(String[] args) {
	Desktop ds=new Desktop();
	ds.DesktopSize();
	ds.ComputerModel();
}
}
